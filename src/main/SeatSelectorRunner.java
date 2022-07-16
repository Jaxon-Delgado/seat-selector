package main;

import main.persons.Admin;
import main.persons.Student;
import main.window.Window;

import java.sql.SQLException;

public class SeatSelectorRunner {
    public static void main(String[] args) {
        Admin jaxon = new Admin();
        jaxon.getAdmins();
        Student connor = new Student();
        connor.getStudents();

        Window window = new Window();
    }
}
