package examples.menu;

import java.io.Serializable;

public class Customer implements Serializable {
    String name;

    public Customer(String name) {
        this.name = name;
    }
}