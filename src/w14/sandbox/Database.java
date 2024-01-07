package w14.sandbox;

import java.sql.*;

public class Database {
    public static Connection getConnection() throws SQLException {
        String dbURL = "jdbc:sqlserver://localhost;database=mainDb;encrypt=false;";
        String user = "sa";
        String pass = "Bfo12345";
        return DriverManager.getConnection(dbURL, user, pass);
    }
}
