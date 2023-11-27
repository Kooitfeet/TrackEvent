package com.example.BackEnd.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "public")
public class Public {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("score")
    private int score;
    @JsonProperty("pseudo")
    private String pseudo;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("inter")
    private List<Integer> inter;
    @JsonProperty("participe")
    private List<Integer> participe;
    @JsonProperty("avis")
    private int avis;
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

    public void setInter(List<Integer> inter) {
        this.inter = inter;
    }

    public void setParticipe(List<Integer> participe) {
        this.participe = participe;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setAvis(int avis) {
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

    public List<Integer> getInter() {
        return inter;
    }

    public List<Integer> getParticipe() {
        return participe;
    }

    public int getScore() {
        return score;
    }

    public int getAvis() {
        return avis;
    }

    public String getPdp() {
        return pdp;
    }

    // Constructor

    public Public(Long id, String pseudo, String mail, List<Integer> inter, List<Integer> participe, int score, int avis, String pdp) {
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
