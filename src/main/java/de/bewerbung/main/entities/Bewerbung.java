package de.bewerbung.main.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bewerbung")
public class Bewerbung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;

    private String firmName;
    private String firmAdress;
    private String email;
    private String ansprechPartner;
    private String telNummer;
    private String zustand;
    private String notizen;
    private Date bewerbungsDatum;

    public Bewerbung() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmAdress() {
        return firmAdress;
    }

    public void setFirmAdress(String firmAdress) {
        this.firmAdress = firmAdress;
    }

    public String getAnsprechPartner() {
        return ansprechPartner;
    }

    public void setAnsprechPartner(String ansprechPartner) {
        this.ansprechPartner = ansprechPartner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNummer() {
        return telNummer;
    }

    public void setTelNummer(String telNummer) {
        this.telNummer = telNummer;
    }

    public String getZustand() {
        return zustand;
    }

    public void setZustand(String zustand) {
        this.zustand = zustand;
    }

    public String getNotizen() {
        return notizen;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

    public Date getBewerbungsDatum() {
        return bewerbungsDatum;
    }

    public void setBewerbungsDatum(Date bewerbungsDatum) {
        this.bewerbungsDatum = bewerbungsDatum;
    }
}
