public class RecieveString {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "!dlroW olleH";
        String str3 = "Hello World!";

        System.out.println(reverseStr(str1));
        System.out.println(reverseStrArr(str2));
        System.out.println(reverseStrCharAt(str3));
    }

    public static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseStrArr(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for(int i = array.length - 1; i >=0; i--) {
            result += array[i];
        }
        return result;
    }

    public static String reverseStrCharAt(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) + result;
            }
            return result;
    }
}

