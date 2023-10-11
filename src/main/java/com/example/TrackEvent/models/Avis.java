package com.example.TrackEvent.models;

public class Avis {
    private long id;
    private long id_part;
    private long id_event;
    private long id_orga;
    private String date;
    private String description;
    private long score;

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

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setScore(long score) {
        this.score = score;
    }

    // Getter

    public long getId() {
        return id;
    }

    public long getId_part() {
        return id_part;
    }

    public long getId_event() {
        return id_event;
    }

    public long getId_orga() {
        return id_orga;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public long getScore() {
        return score;
    }

    //Constructor

    public Avis(long id, long id_part, long id_event, long id_orga, String date, String description, long score) {
        this.id = id;
        this.id_part = id_part;
        this.id_event = id_event;
        this.id_orga = id_orga;
        this.date = date;
        this.description = description;
        this.score = score;
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
                ", score=" + score +
                '}';
    }
}

