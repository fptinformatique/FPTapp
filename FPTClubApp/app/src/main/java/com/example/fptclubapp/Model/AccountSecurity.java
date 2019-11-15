package com.example.fptclubapp.Model;

public class AccountSecurity {

 private String email;
 private String passowrd;
 private boolean activated;


    public AccountSecurity(String email, String passowrd, boolean activated) {
        this.email = email;
        this.passowrd = passowrd;
        this.activated = activated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "AccountSecurity{" +
                "email='" + email + '\'' +
                ", passowrd='" + passowrd + '\'' +
                ", activated=" + activated +
                '}';
    }
}
