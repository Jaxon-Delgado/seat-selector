package main;

import java.sql.Date;

public class Student {
    public String name;
    public String elective1;
    public String elective2;
    public String elective3;
    public String elective4;
    public Date dateOfBirth;
    public boolean math;
    public boolean science;
    public boolean english;
    public boolean history;
    public int gradeLevelInt;
    public String gradeLevelString;
    public int delinqCount;
    public final int ID;

    public Student(int id, String name, String elective1, String elective2, String elective3, String elective4, String gradeLevelString, Date dateOfBirth, boolean math, boolean science, boolean english, boolean history, int delinqCount) {
        this.ID = id;
        this.name = name;
        this.elective1 = elective1;
        this.elective2 = elective2;
        this.elective3 = elective3;
        this.elective4 = elective4;
        this.gradeLevelString = gradeLevelString;
        this.dateOfBirth = dateOfBirth;
        this.math = math;
        this.science = science;
        this.english = english;
        this.history = history;
        this.delinqCount = delinqCount;


    }
}
