package main.persons;


import main.sqlManager.SQLConnection;

import java.sql.*;
import java.util.ArrayList;

public class Admin {

    private long id;
    private String name;
    private java.sql.Date dob;
    private String email;
    private String subject;
    private long securityLvl;


    public PreparedStatement p;
    public ResultSet rs;

    public void getAdmins() {
        // long n = getId();
        // String sql = "SELECT * FROM admin WHERE id = " + n;
        String sql = "SELECT * FROM admin";

        try (Connection con = SQLConnection.connectDB()) {
            assert con != null;
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                this.rs = rs;
                displayAdmin(rs);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAdmin(ResultSet rs) throws SQLException {
        this.rs = rs;
        ArrayList<String> adminList = new ArrayList<>();
        while (rs.next()) {

            String idString = String.valueOf(rs.getInt("id"));
            String dobString = rs.getDate("dob").toString();
            String nameString = getName();
            String securityLevelString = String.valueOf(rs.getInt("security_lvl"));

            adminList.add(idString);
            adminList.add(nameString);
            adminList.add(dobString);
            adminList.add(getEmail());
            adminList.add(getSubject());
            adminList.add(securityLevelString);
            adminList.add("\n");

        }
        System.out.println(adminList);

    }

    public long getId() {

        return id;
    }

    public String getName() throws SQLException {

        return name = rs.getString("first_name") + " " +  rs.getString("last_name");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() throws SQLException {
        return email = rs.getString("email");
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() throws SQLException {
        return subject = rs.getString("subject");
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getSecurityLvl() {
        return securityLvl;
    }

    public void setSecurityLvl(long securityLvl) {
        this.securityLvl = securityLvl;
    }
}
