package se.nackademin.jdbc;

/*
 * Example class that could represent how to save itself to a database.
 * Note: not complete.
 */
public class Drink {
    int id;
    String title;
    float price;
    String creator;

    public static String createTable = """
        CREATE TABLE IF NOT EXISTS drinks (
        id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        title TEXT,
        price DECIMAL(5,2),
        creator TEXT
    )""";

    public static String updateSql = "";

    public Drink(String[] row) {
        id = Integer.parseInt(row[0]);
        title = row[1];
        /// etc

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean saveToDB() {
        return true;
    }

    public static void createFromDB() {
        // for(String[] row : JDBCUtils.read()) {
        //     Drink(row);
        // }
    }


}