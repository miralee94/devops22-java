Preparation:

- Run `mvn install`
- To start the web app with Maven, run `mvn spring-boot:run`
- To build the web app to a JAR, run `mvn clean package` and then run `java -jar target/lesson_9.jar`.

## Exercise

*Easy*: Change the DemoApplication so that it can take two parameters in the url, a and b, and returns the sum of the two. E.g. `localhost:8080/?a=4&b=3` returns a page displaying 7.

*Medium*: Follow the Spring guide for showing dynamic web content: https://spring.io/guides/gs/serving-web-content/ 

*Advanced*: Follow the Spring Boot guide for setting up an app that can talk to the MySQL database you created in last lesson: https://spring.io/guides/gs/accessing-data-mysql/

## Links

- [Spring Boot Application Tutorial](https://spring.io/guides/gs/spring-boot/)
- [Spring Boot in VS Code](https://code.visualstudio.com/docs/java/java-spring-boot)
- Debygging