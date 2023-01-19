package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("127.0.0.1", "3306");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("miradocker94"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "mydb"); // This will create the database with no tables
        jdbcUtils.createTable(conn);
        jdbcUtils.insertIntoTable(conn);
        jdbcUtils.readTable(conn, "drinks");
        jdbcUtils.updateValue(conn);
        jdbcUtils.deleteRow(conn);
        jdbcUtils.readTable(conn, "drinks");
    }
}