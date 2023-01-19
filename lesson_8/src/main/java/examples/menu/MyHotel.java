package examples.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyHotel implements Serializable {
    private static final long serialVersionUID = 5;

    List<Customer> customers = new ArrayList<Customer>();
    List<Room> rooms  = new ArrayList<Room>();

    public void importRoom(int room) {
        rooms.add(new Room(room));
    }

    public void importCustomer(String name) {
        customers.add(new Customer(name));
    }

    public String toString() {
        String s = "";
        for(Customer c : customers) {
            s+= c.name + "\n";
        }
        for(Room r : rooms) {
            s+= r.number + "\n";
        }
        return s;
    }
}
