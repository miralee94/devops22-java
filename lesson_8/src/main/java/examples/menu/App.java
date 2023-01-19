package examples.menu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    static File file = Paths.get("out/MyHotel.dat").toFile();
    static MyHotel mainHotel;

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in).useDelimiter("\r?\n|\r")) {
            menu(sc);
        }

    }

    static void menu(Scanner sc) throws IOException, ClassNotFoundException {

        while (true) {
            System.out.print("Enter a int 1-4 to choice or 'exit' to quit: ");
            if (sc.hasNextInt()) {
                int choice = Integer.valueOf(sc.nextLine());
                App.menu_choices(choice);
            } else {
                if (sc.nextLine().equals("exit")) {
                    break;
                }
            }
        }
    }

    static void menu_choices(int i) throws IOException, ClassNotFoundException {
        switch (i) {
            case 1:
                System.out.println("Write class to file");
                Writer.writeToFile(file, App.mainHotel);
                break;
            case 2:
                System.out.println("Read class from file");
                App.mainHotel = (MyHotel) Writer.readFromFile(file);
                System.out.println(App.mainHotel);
                break;
            case 3:
                System.out.println("import initial data");
                App.mainHotel = new MyHotel();
                App.mainHotel.importCustomer("adam");
                App.mainHotel.importCustomer("eva");
                App.mainHotel.importRoom(333);
                App.mainHotel.importRoom(444);
                break;
            default:
                System.out.println("Unknown selection");
        }
    }
}
