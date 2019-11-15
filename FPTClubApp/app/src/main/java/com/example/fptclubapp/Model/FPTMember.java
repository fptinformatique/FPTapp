package com.example.fptclubapp.Model;

import java.time.LocalDate;
import java.util.Date;

public class FPTMember {

 private  int id;
 private PersonalInfo personalInfo;
 private ProfessionalInfo professionalInfo;
 private AccountSecurity accountSecurity;
 private Date dateAbonnement;
 private Date dateDesabonnement;


    public FPTMember(PersonalInfo personalInfo, ProfessionalInfo professionalInfo, AccountSecurity accountSecurity) {
        this.personalInfo = personalInfo;
        this.professionalInfo = professionalInfo;
        this.accountSecurity = accountSecurity;
        this.dateAbonnement = new Date();
        this.dateDesabonnement = null;

    }

    public void seDesabonner() {
        this.dateDesabonnement = new Date();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public ProfessionalInfo getProfessionalInfo() {
        return professionalInfo;
    }

    public void setProfessionalInfo(ProfessionalInfo professionalInfo) {
        this.professionalInfo = professionalInfo;
    }

    public AccountSecurity getAccountSecurity() {
        return accountSecurity;
    }

    public void setAccountSecurity(AccountSecurity accountSecurity) {
        this.accountSecurity = accountSecurity;
    }

    public Date getDateAbonnement() {
        return dateAbonnement;
    }

    public void setDateAbonnement(Date dateAbonnement) {
        this.dateAbonnement = dateAbonnement;
    }

    public Date getDateDesabonnement() {
        return dateDesabonnement;
    }

    public void setDateDesabonnement(Date dateDesabonnement) {
        this.dateDesabonnement = dateDesabonnement;
    }

    @Override
    public String toString() {
        return "FPTMember{" +
                "id=" + id +
                ", personalInfo : " + personalInfo.toString() + "\n" +
                ", professionalInfo : " + professionalInfo.toString() + "\n" +
                ", accountSecurity :" + accountSecurity.toString() + "\n" +
                ", dateAbonnement=" + ((dateAbonnement == null) ? "indefinie":dateAbonnement.toString()) +
                ", dateDesabonnement=" + ((dateDesabonnement == null) ? "indefinie":dateAbonnement.toString()) +
                '}';
    }
}
