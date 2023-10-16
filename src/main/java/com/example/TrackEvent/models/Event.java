package com.example.TrackEvent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Table(name = "events")
@Getter
public class Event {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int ID;
    private int id_orga;
    private int id_part;
    private String name;
    private String theme;
    private String lieu;
    private String date;
    private int prix;
    private String description;
    private String affiche;

    public Event() {
    }

    // Setter
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setId_part(int id_part) {
        this.id_part = id_part;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setId_orga(int id_orga) {
        this.id_orga = id_orga;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }

    // Getter
    public long getID() {
        return ID;
    }

    public long getId_orga() {
        return id_orga;
    }

    public long getId_part() {
        return id_part;
    }

    public String getTheme() {
        return theme;
    }

    public String getLieu() {
        return lieu;
    }

    public String getDate() {
        return date;
    }

    public String getAffiche() {
        return affiche;
    }

    public String getDescription() {
        return description;
    }

    public long getPrix() {
        return prix;
    }

    public String getName() {
        return name;
    }

    // Constructor
    public Event(int ID, int id_orga, int id_part, String theme, String lieu, String date, String affiche, String description, int prix) {
        this.ID = ID;
        this.id_orga = id_orga;
        this.id_part = id_part;
        this.theme = theme;
        this.lieu = lieu;
        this.date = date;
        this.affiche = affiche;
        this.description = description;
        this.prix = prix;
        this.name = name;
    }

    // ToString

    @Override
    public String toString() {
        return "Event{" +
                "ID=" + ID +
                ", id_orga=" + id_orga +
                ", id_part=" + id_part +
                ", theme='" + theme + '\'' +
                ", lieu='" + lieu + '\'' +
                ", date='" + date + '\'' +
                ", affiche=" + affiche +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
