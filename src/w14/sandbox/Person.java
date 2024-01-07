package w14.sandbox;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
    private int id;
    private String firstname;
    private String lastname;

    public Person(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static Person[] getPersonArray(){
        Connection conn = null;

        int recordCount = 0;
        int counter = 0;
        Person[] personArr;

        try {

            conn = Database.getConnection();

            if (conn != null) {
                Statement stmt = conn.createStatement();
                String sql = "SELECT COUNT(id) AS recordCount FROM people";
                ResultSet rset = stmt.executeQuery(sql);
                rset.next();
                recordCount = rset.getInt("recordCount");

                personArr = new Person[recordCount];

                sql = "SELECT * FROM people";

                rset = stmt.executeQuery(sql);

                while (rset.next()){
                    personArr[counter] = new Person(rset.getInt("id"));
                    personArr[counter].setFirstname(rset.getString("firstname"));
                    personArr[counter].setLastname(rset.getString("lastname"));
                    counter++;
                }
            }else{
                personArr = new Person[0];
            }

        } catch (SQLException ex) {
            personArr = new Person[0];
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return personArr;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
