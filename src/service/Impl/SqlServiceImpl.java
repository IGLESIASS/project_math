package service.Impl;

import service.SqlService;
import utils.Configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlServiceImpl implements SqlService {

    @Override
    public void processSqlQuery(String sqlQuery) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = getDBConnection();
            if (connection != null) {
                preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    private Connection getDBConnection() {
        try {
            return DriverManager.getConnection(Configs.DB_URL.getValue(), Configs.DB_LOGIN.getValue(), Configs.DB_PASSWORD.getValue());
        } catch (SQLException ex) {
            System.out.println("Failed to get connection: " + ex);
            return null;
        }
    }
}
