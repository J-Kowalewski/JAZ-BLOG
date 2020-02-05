package pl.edu.pjwstk.jaz.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageController {
    public String editEntry()
    {
        return "/entries/editentry.xhtml?faces-redirect=true";
    }
    public String entryList() { return "/entries/entrylist.xhtml?faces-redirect=true";}
    public String gotoLogin(){
        return "/login.xhtml?faces-redirect=true";
    }

}
