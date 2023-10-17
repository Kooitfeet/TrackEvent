package com.example.TrackEvent.models;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "Orga")
@Getter
public class Orga {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String pseudo;
    private String mail;
    private String entreprise;
    private long id_event;
    private long Avis;
    private String description;
    private String reseaux;
    private byte[] Affiche;
    private byte[] pdp;

    public Orga() {

    }

    // Setter
    public void setId(long id) {
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

    public void setId_event(long id_event) {
        this.id_event = id_event;
    }

    public void setAvis(long avis) {
        Avis = avis;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReseaux(String reseaux) {
        this.reseaux = reseaux;
    }

    public void setAffiche(byte[] affiche) {
        Affiche = affiche;
    }

    public void setPdp(byte[] pdp) {
        this.pdp = pdp;
    }

    // Getter
    public long getId() {
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

    public long getId_event() {
        return id_event;
    }

    public long getAvis() {
        return Avis;
    }

    public String getDescription() {
        return description;
    }

    public String getReseaux() {
        return reseaux;
    }

    public byte[] getAffiche() {
        return Affiche;
    }

    public byte[] getPdp() {
        return pdp;
    }

    // Constructor
    public Orga(long id, String pseudo, String mail, String entreprise, long id_event, long avis, String description, String reseaux, byte[] affiche, byte[] pdp) {
        this.id = id;
        this.pseudo = pseudo;
        this.mail = mail;
        this.entreprise = entreprise;
        this.id_event = id_event;
        Avis = avis;
        this.description = description;
        this.reseaux = reseaux;
        Affiche = affiche;
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
                ", id_event=" + id_event +
                ", Avis=" + Avis +
                ", description='" + description + '\'' +
                ", reseaux='" + reseaux + '\'' +
                '}';
    }
}
