import java.sql.*;

public class jdbc_lab {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/javaDatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "123...benaiah";

    //main method
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                createTable(connection);
                insertData(connection, "Lushomo", 19);
                executeQueries(connection);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //method to create the table
    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS my_details (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "age INT)";
        
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }
    //method to insert the data
    private static void insertData(Connection connection, String name, int age) throws SQLException {
        String insertQuery = "INSERT INTO my_details (name, age) VALUES (?, ?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            int rowsInserted = preparedStatement.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
        }
    }
    //method to execute the queries
    private static void executeQueries(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM my_details";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                //display entered information
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        }
    }
}
/*
HOW IT WAS DONE;
1.java packs and MySQL had been already installed.
2.Downloaded MySQL Connector/J: Download the MySQL Connector/J JDBC driver from the official MySQL website (https://dev.mysql.com/downloads/connector/j/).
 Chose the appropriate version based on my MySQL installation and Java version.

3.I added the MySQL Connector/J JAR file to my project's/program's classpath( C:\Users\ASUS\Documents\java programs from notepad\labs) after unzipping the download.

4.Then created a program for connecting to the database created(javaDatabase).Then noted of the database name, username, and password for connecting to it.
This was done in this program.A table creation, data insertion into table(my_details), execution of the queries was done in this program using methods.
The table adds 3 columns(id, name and age).

5.The file was run by Command prompt:
-step one; C:\Users\ASUS\Documents\java programs from notepad\lab>javac jdbc_lab.java
-step two; C:\Users\ASUS\Documents\java programs from notepad\lab>java -cp mysql-connector-j-8.1.0.jar;. jdbc_lab

The first display is below as the ID auto increments;
Data inserted successfully!
ID: 1, Name: Lushomo, Age: 19


.And this is how it was done.
*/ 
