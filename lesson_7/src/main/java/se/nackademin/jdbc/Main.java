package se.nackademin.jdbc;

import java.sql.SQLException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws SQLException {
        JDBCUtils jdbcUtils = new JDBCUtils("localhost");
        jdbcUtils.setUsername("root"); // Never use the root user in real apps
        jdbcUtils.setPassword("example"); // Never add hardcoded passwords to your code

        Connection conn = jdbcUtils.getConnection();
        jdbcUtils.createDatabase(conn, "example"); // This will create the database with no tables

        jdbcUtils.createTable();
        //jdbcUtils.create(new String[] {"latte", "10.0", "Me"});
        String[][] res = jdbcUtils.read();
        jdbcUtils.update(1, "platte");
        jdbcUtils.delete(2);
        for (String[] row : res) {
            System.out.println(String.join(",", row));
        }
    }
}