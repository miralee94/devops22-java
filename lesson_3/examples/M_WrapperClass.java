package lesson_3.examples;

public class M_WrapperClass {
    public static void main(String[] args) {
        int i = 10;
        System.out.printf("i: %d\n", i);
        Integer I = i;
        I++;
        System.out.printf("I after increment on i: %d\n", I);
        int j = I;
        System.out.printf("Assign I to j %d\n", j);
    }
}
