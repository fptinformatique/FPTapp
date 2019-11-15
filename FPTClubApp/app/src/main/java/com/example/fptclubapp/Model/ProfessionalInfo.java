package com.example.fptclubapp.Model;

import java.util.ArrayList;

public class ProfessionalInfo {


private String etablissement;
private String niveau;
private ArrayList<String> diplomesEtCertifs;

    public ProfessionalInfo(String etablissement, String niveau, ArrayList<String> diplomesEtCertifs) {
        this.etablissement = etablissement;
        this.niveau = niveau;
        this.diplomesEtCertifs = diplomesEtCertifs;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public ArrayList<String> getDiplomesEtCertifs() {
        return diplomesEtCertifs;
    }

    public void setDiplomesEtCertifs(ArrayList<String> diplomesEtCertifs) {
        this.diplomesEtCertifs = diplomesEtCertifs;
    }

    @Override
    public String toString() {
        return "ProfessionalInfo{" +
                "etablissement='" + etablissement + '\'' +
                ", niveau='" + niveau + '\'' +
                ", diplomesEtCertifs=" + diplomesEtCertifs +
                '}';
    }
}
