# Exercise 5

## Instructions

The main goal of this exercise is to learn about databases in java.

### `Exercise` Plain Java Database usage

1. Fork or clone the project [devops22-java_database](https://github.com/fictive-reality/devops22-java_database)
2. Setup a database, either install or use a docker image [dockerhub mysql](https://hub.docker.com/_/mysql) check the header `Environment Variables` for more settings. You can make docker setup your database if you set variables:
   - Setup a database with `-e MYSQL_DATABASE=example`
   - Setup a user in the database with `-e MYSQL_USER=username`
   - Setup a password for the user with `-e MYSQL_PASSWORD=password`

   ```bash
   docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -p 3306:3306 -d mysql
   ```

3. In `devops22-java_database` you will find a class called `JDBCUtils.java` with the package `se.nackademin.jdbc` you also find a `Main.java`.
   1. Read through the `Main.java` code and understand how the `JDBCUtils.java` is used
   2. Read through the `JDBCUtils.java`, the code contains some flaws and limitations, that we will later fix. For now its enough to understand the code.
      1. Notice the instance field `username` and `password` is it needed at all? Can you improve it somehow?
      2. The instance method `createDatabase` will create a database for you, but it will not setup any tables.
      3. The instance method `getConnection` builds a connection string, but it doesn't specify a database name in the JDBC url, read more about the format [https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html]
4. Before we can test the code we need to Download a JDBC connector (driver) [mysql j connector download](https://dev.mysql.com/downloads/connector/j/) select "platform independent" in the dropdown. *NOTE* you don't have to create a account, there is a `No thanks, just start my download.`. Unzip the file and add it to your vscode `devops22-java_database` read about how in [manage dependencies](https://code.visualstudio.com/docs/java/java-project#_manage-dependencies-for-unmanaged-folder) then click `java projects` -> `Referenced Libraries` -> +.
   1. Make sure that your connection works, by running the java program it should say `Connected to db`. A prerequisite is a running database either through docker or a installed database. You must also configure the correct username, password, port and database name. You should change the java code to match your settings! *NOTE* The database name is set in the JDBC url used by `DriverManager.getConnection`.
   2. Make sure that the command `jdbcUtils.createDatabase(conn, "example");` in your `Main` do create a database named `example`. A easy way to confirm this is to inspect your database with the CLI or MySQL Workbench.
5. You can manually create a table with mysql tooling with for example [mysql workbench](https://www.mysql.com/products/workbench/) or write code that does it with `createDatabase`. Scroll down to the header [Creating Tables with JDBC API](https://docs.oracle.com/javase/tutorial/jdbc/basics/tables.html#create)
6. Now when you know the database works and you can inspect it manually with a CLI or MySQL workbench. Add `CRUD` methods to your `JDBCUtils` you are recommended to use [prepared statements](https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html#create_ps). You decide yourself what your application and database will do.
   - Create (A method that can create a row of data `INSERT INTO`)
   - Read (A method that can read all or a single row `SELECT`)
   - Update (A method that can update a row `UPDATE`)
   - Delete (A method that can `DELETE` a row)
7. Write code in `Main` that calls your CRUD methods in `JDBCUtils`.

### `Exercise` Install Maven

1. Follow instruction how to install [maven](https://maven.apache.org/), if you install with brew check FEP.md.

2. Run mvn --version and take a screenshot

    ```bash
    mvn --version
    ```

### `Exercise` [EXTRA] Spring boot database usage with a ORM

This is an extra exercise, it's not mandatory. Follow the guide [accessing data mysql](https://spring.io/guides/gs/accessing-data-mysql/)

1. Create a new repository where you can package up the downloaded file in the following step
2. Follow the guide from spring.io. [accessing data mysql](https://spring.io/guides/gs/accessing-data-mysql/)

    ```text
    # If you use the spring initializr at <https://start.spring.io/>
    1. Select Project `Maven project`
    2. Select Language `Java`
    3. Add `Spring Web`, `Spring Data JPA`, `MySQL Driver`
    ```

3. [optional] Hand in, give me access to your repository

## Hand in instructions

### General hand in instructions

- Create a branch with name `YOURUSERNAME_lesson_5`

Hand in your exercise in a `Pull Request` that contains screenshot[s] and file[s]. You can also use the feature `attach a file` for screenshots in your `Pull Request`

### What to hand in

In repository [devops22-java_database](https://github.com/fictive-reality/devops22-java_database)

Hand in files:

- Added files & modified files
- Provide a screenshot of the database table
- Provide a screenshot of the java console output from a queried database row.
- Provide a screenshot of the maven version
