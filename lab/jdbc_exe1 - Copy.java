import java.sql.*;

public class jdbc_exe1 {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASSWORD ="";

    //main method
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                createTable(connection);
                insertData(connection, "Amos", 56);
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
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "age INT)";
        
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }
    //method to insert the data
    private static void insertData(Connection connection, String name, int age) throws SQLException {
        String insertQuery = "INSERT INTO users (name, age) VALUES (?, ?)";
        
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
        String selectQuery = "SELECT * FROM users";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        }
    }
}
