package lesson_1.examples.java;

class Example {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Example example = new Example();
        example.sum_range();
    }

    public void sum_range() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
