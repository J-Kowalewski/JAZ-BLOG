package pl.edu.pjwstk.jaz.samples.door.edit;

import pl.edu.pjwstk.jaz.samples.jpa.Door;
import pl.edu.pjwstk.jaz.samples.jpa.Location;

public class EditDoorRequest {
    private Long id;
    private String name;
    private String floor;
    private String author;
    private String date;

    public EditDoorRequest() {
    }

    //TODO autor ma się ustawiać na UserContext.getUsername()
    //TODO SAME SHIT WITH DATE ListCategoryController.getCurrentDate()
    //TODO LISTAAA WPISÓW MA SIĘ WYŚWIETLAĆ BEZ LOGOWANIA DO CHUUUUJAAA

    public EditDoorRequest(Door door) {
        this.id = door.getId();
        this.name = door.getLocation().getName();
        this.floor = door.getLocation().getFloor();
        this.author = door.getLocation().getAuthor();
        this.date = door.getLocation().getDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Door toDoor() {
        return new Door(id, new Location(name, floor, author, date));
    }
}
