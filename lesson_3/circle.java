import java.util.Scanner;

public class circle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange radius: ");
        double radius = sc.nextDouble();
        double omkrets = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Omkrets: " + omkrets);
        System.out.println("Area: " + area);
    }

}
