import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconn {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/BankATM";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0000";

    public Connection connection;

    public DBconn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public double getBalance(int pin, String customerID) {
        double balance = 0.0;
        String sqlQuery = "SELECT Balance FROM login10 WHERE PIN = ? AND CustomerID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            preparedStatement.setInt(1, pin);
            preparedStatement.setString(2, customerID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                balance = resultSet.getDouble("Balance");
            } else {
                System.out.println("No records found for PIN " + pin + " and CustomerID " + customerID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }

    public void updateBalance(int pin, String customerID, double newBalance) {
        String updateQuery = "UPDATE login10 SET Balance = ? WHERE PIN = ? AND CustomerID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setDouble(1, newBalance);
            preparedStatement.setInt(2, pin);
            preparedStatement.setString(3, customerID);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
