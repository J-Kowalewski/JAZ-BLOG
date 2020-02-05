package pl.edu.pjwstk.jaz.entries.list;

import pl.edu.pjwstk.jaz.entries.jpa.Entry;
import pl.edu.pjwstk.jaz.entries.jpa.EntryRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ListEntryController {

    @Inject
    private EntryRepository entryRepository;

    public List<Entry> getEntryList() {
        return entryRepository.findAll();
    }
}
