package pl.edu.pjwstk.jaz.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageController {
    public String editList()
    {
        return "/samples/editdoor.xhtml?faces-redirect=true";
    }
    public String doorList() { return "/samples/doorlist.xhtml?faces-redirect=true";}
    public String gotoLogin(){
        return "/login.xhtml?faces-redirect=true";
    }

}
