package com.example.BackEnd.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orga")
public class Orga {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("pseudo")
    private String pseudo;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("entreprise")
    private String entreprise;
    @JsonProperty("description")
    private String description;
    @JsonProperty("reseaux")
    private String reseaux;
    @JsonProperty("affiche")
    private String affiche;
    @JsonProperty("organise")
    private List<Integer> organise;
    @JsonProperty("pdp")
    private String pdp;

    public Orga() {
        organise = new ArrayList<>();
    }

    // Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public void setAvis(long id_avis) {
        id_avis = id_avis;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReseaux(String reseaux) {
        this.reseaux = reseaux;
    }

    public void setAffiche(String affiche) {
        affiche = affiche;
    }

    public void setOrganise(List<Integer> organise) {
        this.organise = organise;
    }

    public void setPdp(String pdp) {
        this.pdp = pdp;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMail() {
        return mail;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public String getDescription() {
        return description;
    }

    public String getReseaux() {
        return reseaux;
    }

    public String getAffiche() {
        return affiche;
    }

    public List<Integer> getOrganise() {
        return organise;
    }

    public String getPdp() {
        return pdp;
    }

    // Constructor
    public Orga(Long id, String pseudo, String mail, String entreprise, long id_event, long avis, String description, String reseaux, String affiche, List<Integer> organise, String pdp) {
        this.id = id;
        this.pseudo = pseudo;
        this.mail = mail;
        this.entreprise = entreprise;
        this.description = description;
        this.reseaux = reseaux;
        this.affiche = affiche;
        this.organise = organise;
        this.pdp = pdp;
    }

    // ToString
    @Override
    public String toString() {
        return "Orga{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", mail='" + mail + '\'' +
                ", entreprise='" + entreprise + '\'' +
                ", description='" + description + '\'' +
                ", organise='" + organise + '\'' +
                ", reseaux='" + reseaux + '\'' +
                '}';
    }
}
