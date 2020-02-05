package pl.edu.pjwstk.jaz.entries.edit;

import pl.edu.pjwstk.jaz.ParamRetriever;
import pl.edu.pjwstk.jaz.entries.jpa.EntryRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class EditEntryController {
    @Inject
    private EntryRepository entryRepository;

    @Inject
    private ParamRetriever paramRetriever;

    private EditEntryRequest editEntryRequest;



    public EditEntryRequest getEditRequest() {
        if (editEntryRequest == null) {
            editEntryRequest = createEditEntryRequest();
        }
        return editEntryRequest;
    }

    private EditEntryRequest createEditEntryRequest() {
        if (paramRetriever.contains("entryId")) {
            var entryId = paramRetriever.getLong("entryId");
            var entry = entryRepository.findEntryById(entryId).orElseThrow();
            return new EditEntryRequest(entry);
        }
        return new EditEntryRequest();
    }

    public String save() {
        var entry = editEntryRequest.toEntry();
        entryRepository.save(entry);

        return "/entries/entrylist.xhtml?faces-redirect=true";
    }
}
