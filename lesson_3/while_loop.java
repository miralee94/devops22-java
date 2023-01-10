class Test {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 5) {
            System.out.println("*");
            if (n == 2) {
                break;
            }
            n++;
        }
    }
}

class Test2 {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 10) {
            if (n == 5) {
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
    }
}