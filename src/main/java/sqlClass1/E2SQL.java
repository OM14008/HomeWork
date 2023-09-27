package sqlClass1;

import Utils.ConfigReader;

import java.sql.*;

public class E2SQL {
    public static void main(String[] args) {
        String dbUrl = ConfigReader.getProperty("dbUrl");
        String dbUserName = ConfigReader.getProperty("dbUserName");
        String dbPassword = ConfigReader.getProperty("dbPassword");
        try {
            Connection connection = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
            Statement statement = connection.createStatement();
            String query = "select * from employee";
            //executes the query and store it in resultSet variable
            ResultSet resultSet = statement.executeQuery(query);
            //information about the data for example number of columns names data types etc
            ResultSetMetaData MetaData = resultSet.getMetaData();
            //gives the number of columns in the resultSet
            int columnCount=MetaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(MetaData.getColumnLabel(i)+" ");
            }
            System.out.println();
            //while loop goes through the rows  and for loop goes through the columns
            while(resultSet.next()){
                for (int i = 1; i <= columnCount ; i++) {
                    System.out.print(resultSet.getString(i)+" ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
