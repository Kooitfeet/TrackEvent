package com.example.TrackEvent.models;

public class Event {
    private long ID;
    private long id_orga;
    private long id_part;
    private String theme;
    private String lieu;
    private String date;
    private byte affiche;
    private String description;
    private long prix;

    // Setter
    public void setID(long ID) {
        this.ID = ID;
    }

    public void setId_orga(long id_orga) {
        this.id_orga = id_orga;
    }

    public void setId_part(long id_part) {
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

    public void setAffiche(byte affiche) {
        this.affiche = affiche;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(long prix) {
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

    public byte getAffiche() {
        return affiche;
    }

    public String getDescription() {
        return description;
    }

    public long getPrix() {
        return prix;
    }

    // Constructor
    public Event(long ID, long id_orga, long id_part, String theme, String lieu, String date, byte affiche, String description, long prix) {
        this.ID = ID;
        this.id_orga = id_orga;
        this.id_part = id_part;
        this.theme = theme;
        this.lieu = lieu;
        this.date = date;
        this.affiche = affiche;
        this.description = description;
        this.prix = prix;
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
