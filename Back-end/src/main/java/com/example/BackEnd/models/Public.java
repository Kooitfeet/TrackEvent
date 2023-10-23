package com.example.BackEnd.models;


import jakarta.persistence.*;

@Entity
@Table(name = "public")
public class Public {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private int score;
    private String pseudo;
    private String mail;
    private String inter;
    private String participe;
    private String avis;
    private String pdp;

    public Public() {

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

    public Public(long id, String pseudo, String mail, String inter, String participe, int score, String avis, String pdp) {
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
