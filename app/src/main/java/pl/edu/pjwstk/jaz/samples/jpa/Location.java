package pl.edu.pjwstk.jaz.samples.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class Location {
    @Column(name = "name")
    private String name;

    @Column(name = "floor")
    private String floor;

    @Column(name= "author")
    private String author;

    @Column(name= "date")
    private String date;

    public Location() {
    }

    public Location(String name, String floor, String author, String date) {
        this.name = name;
        this.floor = floor;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getFloor() {
        return floor;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }
}
