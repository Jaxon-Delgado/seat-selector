package main;

import java.sql.Date;

public class Admin {

    public final int ID;

    public String name;
    public Date dateOfBirth;
    public String email;
    public String subject;
    public int securityLevel;

    public Admin(String name, String subject, String email, int securityLevel, int id, Date dateOfBirth) {
        this.ID = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.subject = subject;
        this.securityLevel = securityLevel;


    }
}
