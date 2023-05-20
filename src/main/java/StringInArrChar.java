public class StringInArrChar {
    public static void main(String[] args) {
        char minValue = 48;  // 0
        char maxValue = 57;  // 9
        String str = "1234%56486";
        char[] newStr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            newStr[i] = str.charAt(i);
            if (newStr[i] < minValue || newStr[i] > maxValue)
                System.out.println("В строке не только числа");
            else System.out.println("Все good");
        }
    }
}
