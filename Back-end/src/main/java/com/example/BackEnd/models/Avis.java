package com.example.BackEnd.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "avis")
public class Avis {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private long id_orga;
    private long id_part;
    private long id_event;
    private Date date;
    private String description;
    private long note;

    public Avis() {

    }

    // Setter

    public void setId(long id) {
        this.id = id;
    }

    public void setId_part(long id_part) {
        this.id_part = id_part;
    }

    public void setId_event(long id_event) {
        this.id_event = id_event;
    }

    public void setId_orga(long id_orga) {
        this.id_orga = id_orga;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setScore(long note) {
        this.note = note;
    }

    //Constructor

    public Avis(long id, long id_part, long id_event, long id_orga, Date date, String description, long note) {
        this.id = id;
        this.id_part = id_part;
        this.id_event = id_event;
        this.id_orga = id_orga;
        this.date = date;
        this.description = description;
        this.note = note;
    }

    //ToString

    @Override
    public String toString() {
        return "Avis{" +
                "id=" + id +
                ", id_part=" + id_part +
                ", id_event=" + id_event +
                ", id_orga=" + id_orga +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", note=" + note +
                '}';
    }
}
