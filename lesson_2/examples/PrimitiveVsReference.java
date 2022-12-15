package lesson_2.examples;

class PrimitiveVsReference {

    public static void main(String arg[]) {
        Integer y = 10;

        String i = y.toString();
        // This will not work since it's a primitive type
        // String j = x.toString();

        // System.out.println(x);
        System.out.println(y);
        System.out.println(i);

    }
}