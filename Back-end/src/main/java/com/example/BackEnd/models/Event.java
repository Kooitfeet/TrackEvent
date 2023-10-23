package com.example.BackEnd.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

        @Id
        @JsonProperty("id")
        private Long id;
        @JsonProperty("id_orga")
        private int id_orga;
        @JsonProperty("id_part")
        private int id_part;
        @JsonProperty("prix")
        private int prix;
        @JsonProperty("theme")
        private String theme;
        @JsonProperty("name")
        private String name;
        @JsonProperty("lieu")
        private String lieu;
        @JsonProperty("date")
        private String date;
        @JsonProperty("description")
        private String description;
        @JsonProperty("affiche")
        private String affiche;

    public Event() {
    }

    // Setter
        public void setID(Long ID) {
            this.id = ID;
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


        // Constructor
        public Event(Long id, int id_orga, int id_part, String theme, String lieu, String date, String affiche, String description, int prix) {
            this.id = id;
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
                    "ID=" + id +
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
