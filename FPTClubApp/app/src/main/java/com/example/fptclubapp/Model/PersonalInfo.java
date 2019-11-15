package com.example.fptclubapp.Model;

import java.util.Date;

public class PersonalInfo {

private String nom;
private String prenom;
private String cin;
private int age;
private Date datenaissance;

    public PersonalInfo(String nom, String prenom, String cin, int age, Date datenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.age = age;
        this.datenaissance = datenaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", age=" + age +
                ", datenaissance=" + datenaissance.toString() +
                '}';
    }
}
