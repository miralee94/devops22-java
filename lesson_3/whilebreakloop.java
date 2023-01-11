class WhileBreakLoop {

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
