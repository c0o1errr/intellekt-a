public class NumberConverter {
    public static void printAll(int value) {
        binary(value);
        octal(value);
        hex(value);
    }

    private static void binary(int k) {
        System.out.println(k + " in BIN " + Integer.toBinaryString(k));
    }

    private static void octal(int k) {
        System.out.println(k + " in OCT " + Integer.toOctalString(k));
    }

    private static void hex(int k) {
        System.out.println(k + " in HEX " + Integer.toHexString(k));
    }

    public static void main(String[] args) {
        int key = 12;
        printAll(key);
    }
}
