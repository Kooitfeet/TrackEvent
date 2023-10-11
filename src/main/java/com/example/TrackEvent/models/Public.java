package com.example.TrackEvent.models;

import java.util.Arrays;

public class Public {
    private long id;
    private String pseudo;
    private String mail;
    private String inter;
    private String participe;
    private int score;
    private String Avis;
    private byte[] pdp;

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
        Avis = avis;
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
        return Avis;
    }

    public byte[] getPdp() {
        return pdp;
    }

    // Constructor

    public Public(long id, String pseudo, String mail, String inter, String participe, int score, String avis, byte[] pdp) {
        this.id = id;
        this.pseudo = pseudo;
        this.mail = mail;
        this.inter = inter;
        this.participe = participe;
        this.score = score;
        Avis = avis;
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
                ", Avis='" + Avis + '\'' +
                ", pdp=" + Arrays.toString(pdp) +
                '}';
    }
}
