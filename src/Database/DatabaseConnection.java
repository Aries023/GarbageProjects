package Database;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://lokalhost:3306/Campan","root",""); // ked tak prepisat lokalhost a heslo
            Statement statement = con.createStatement();
            ResultSet resultSet =statement.executeQuery("SELECT * FROM campan.ingredients;"); // to co chces

            while (resultSet.next()){ // prejde to co chces
                System.out.println(resultSet.getString("ingredien")); //vypise to co chces z toho co chces
            }
            System.out.println("succes");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
