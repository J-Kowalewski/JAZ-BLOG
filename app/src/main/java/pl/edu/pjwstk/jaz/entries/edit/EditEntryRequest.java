package pl.edu.pjwstk.jaz.entries.edit;

import pl.edu.pjwstk.jaz.entries.jpa.Entry;
import pl.edu.pjwstk.jaz.entries.jpa.Location;

import java.time.LocalDate;

public class EditEntryRequest {

    private Long id;
    private String name;
    private String floor;
    private String author;
    private String date;

    public EditEntryRequest() {
    }

    //TODO autor ma się ustawiać na UserContext.getUsername() [null pointer]

    public EditEntryRequest(Entry entry) {
        this.id = entry.getId();
        this.name = entry.getLocation().getName();
        this.floor = entry.getLocation().getFloor();
        this.author = entry.getLocation().getAuthor();
        this.date = entry.getLocation().getDate();
    }

    public String getCurrentDate(){
        return String.valueOf(LocalDate.now());
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

    public Entry toEntry() {
        return new Entry(id, new Location(name, floor, author, getCurrentDate()));
    }
}
