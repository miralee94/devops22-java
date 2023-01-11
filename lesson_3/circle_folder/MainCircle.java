import java.util.Scanner;

public class MainCircle {
    public static void main(String[]args) {
        Circle circle = new Circle(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange radius: ");
        double radius = sc.nextDouble();
        circle.radius = radius;
        System.out.println("Omkrets: " + circle.omkrets());
        System.out.println("Area: " + circle.area());
    }

}
