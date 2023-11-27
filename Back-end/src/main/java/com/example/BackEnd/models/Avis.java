package com.example.BackEnd.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "avis")
public class Avis {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("orga")
    @Column(name = "orga")
    private int id_orga;
    @JsonProperty("part")
    @Column(name = "part")
    private int id_part;
    @JsonProperty("event")
    @Column(name = "event")
    private int id_event;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("description")
    private String description;
    @JsonProperty("note")
    private long note;

    public Avis() {
    }

    // Setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_part(int id_part) {
        this.id_part = id_part;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public void setId_orga(int id_orga) {
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

    public Avis(Long id, int id_part, int id_event, int id_orga, Date date, String description, long note) {
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
