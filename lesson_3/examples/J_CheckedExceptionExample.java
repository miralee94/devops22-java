package lesson_3.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J_CheckedExceptionExample {

    // Group Exercise: Write method that requires throws
    public static void main(String[] args) {
        File file = new File("data.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File data.txt not found.");
            e.printStackTrace();
        }
    }
}
