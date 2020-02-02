package pl.edu.pjwstk.jaz.admin.category.list;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;

@Named
@RequestScoped
public class ListCategoryController {
    public String editList()
    {
        return "/samples/editdoor.xhtml?faces-redirect=true";
    }
    public String doorList() { return "/samples/doorlist.xhtml?faces-redirect=true";}
    public String returnToIndex(){
        return "/index.xhtml?faces-redirect=true";
    }
    public String gotoLogin(){
        return "/login.xhtml?faces-redirect=true";
    }
    public LocalDate getCurrentDate(){
        return java.time.LocalDate.now();
    }
}
