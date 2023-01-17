package se.nackademin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class JDBCUtils {
    String hostname = "localhost";
    String userName = "username";
    String password = "password"; // Never add hardcoded passwords to your code
    String port = "3306";
    Connection conn;

    JDBCUtils(String hostname) {
        this.hostname = hostname;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createDatabase(Connection conn, String name) throws SQLException {
        String createString = "create database IF NOT EXISTS " + name;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void createTable() {
        String sql = """
            CREATE TABLE drinks (
            title TEXT,
            price DECIMAL(5,2),
            creator TEXT,
        )""";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public boolean create(String[] row) {
        String sql = """
            INSERT INTO drinks (
            title = ?,
            price = ?,
            creator = ?,
        )""";
        try (Statement stmt = conn.createStatement()) {
            PreparedStatement st = conn.prepareStatement(sql, row);
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public String[][] read(Connection conn) {
        String sql = """
            SELECT FROM drinks""";
        List<String> results = new ArrayList<String>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                rs.
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");
                System.out.println(coffeeName + ", " + supplierID + ", " + price +
                                   ", " + sales + ", " + total);
              }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(Connection conn) {
        
    }

    public void delete(Connection conn) {
        
    }

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        // Modify the "/" after this.port to set a specific database
        conn = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/", connectionProps);

        System.out.println("Connected to db");
        this.conn = conn;
        return conn;
    }
}
