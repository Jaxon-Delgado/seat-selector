package main.sqlManager;

import java.sql.*;

public class SQLConnection {

    Connection con = null;

    public static Connection connectDB() {
        String url = "jdbc:postgresql://localhost/school_accounts?useSSL=false";
        String user = "jaxon-mac";
        String pass = "jaxon11";

        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}



