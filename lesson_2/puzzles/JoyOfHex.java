// What does this program print? Guess before you run it, then explain why in a comment below.

public class JoyOfHex {

    private static String lpads(String s, int l) {
        return String.format("%1$" + l + "s", s);
    }

    private static String lpad0(String s, int l) {
        return String.format("%1$" + l + "s", s).replace(' ', '0');
    }

    private static void printcomp(String varname, long l) {
        System.out.println(lpads(varname, 4)+" long="+lpads(Long.toString(l),10)+", hex="+lpad0(Long.toHexString(l), 16)+", bin="+lpad0(Long.toBinaryString(l), 64));
    }

    private static void printcomp(String varname, int l) {
        System.out.println(lpads(varname, 4)+"  int="+lpads(Integer.toString(l),10)+", hex="+lpad0(Integer.toHexString(l), 8)+", bin="+lpad0(Integer.toBinaryString(l), 32));
    }

    public static void main(String[] args) {
        int a = 0xcafebabe; // also try -1
        printcomp("a", a);
        // a is the negative decimal -889275714 because hex numbers include sign
        long long_a = (long)a;
        printcomp("a", long_a);
        // a is now widened to 64 bits. As it's negative, it means extending the prefix with many f (hex) or 1 (binary)
        long b = 0x100000000L;
        printcomp("b", b);
        // b is a positive long number, larger than what can be represented in integer
        long sum = a + b;
        printcomp("sum", sum);
        // sum becomes the complement
        System.out.println(Long.toHexString(0x100000000l + 0xcafebabe));
    }
}