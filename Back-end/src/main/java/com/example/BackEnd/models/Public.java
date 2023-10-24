package com.example.BackEnd.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "public")
public class Public {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("score")
    private int score;
    @JsonProperty("pseudo")
    private String pseudo;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("inter")
    private String inter;
    @JsonProperty("participe")
    private String participe;
    @JsonProperty("avis")
    private String avis;
    @JsonProperty("pdp")
    private String pdp;

    public Public() {

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

    public void setInter(String inter) {
        this.inter = inter;
    }

    public void setParticipe(String participe) {
        this.participe = participe;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public void setPdp(String pdp) {
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

    public String getInter() {
        return inter;
    }

    public String getParticipe() {
        return participe;
    }

    public int getScore() {
        return score;
    }

    public String getAvis() {
        return avis;
    }

    public String getPdp() {
        return pdp;
    }

    // Constructor

    public Public(Long id, String pseudo, String mail, String inter, String participe, int score, String avis, String pdp) {
        this.id = id;
        this.pseudo = pseudo;
        this.mail = mail;
        this.inter = inter;
        this.participe = participe;
        this.score = score;
        this.avis = avis;
        this.pdp = pdp;
    }

    // ToString

    @Override
    public String toString() {
        return "Public{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", mail='" + mail + '\'' +
                ", inter='" + inter + '\'' +
                ", participe='" + participe + '\'' +
                ", score=" + score +
                ", Avis='" + avis + '\'' +
                ", pdp=" + pdp +
                '}';
    }
}
