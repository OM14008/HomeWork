package sqlClass1;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args){
        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String  password="syntaxhrm123";
        try {
            //we need to create connection to connect to the database first
            Connection connection = DriverManager.getConnection(dbUrl,userName,password);
            //this statement takes the quires execute them on the database and brings the results back
            Statement statement = connection.createStatement();
            String query = "select * from person";
            ResultSet resultset = statement.executeQuery(query);
            //Results contains the results of the query that we execute  on the database in the form of table
            while(resultset.next()){
                String firstName = resultset.getString("Firstname");
                int age = resultset.getInt("age");
                String city = resultset.getString("city");
                System.out.println(firstName+" "+age+" "+city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
