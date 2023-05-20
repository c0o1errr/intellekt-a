public class stringSort {
    public static void main(String[] args) {
        String inParam = "*з*а* *д*а*н*н*ы*й* *п*е*р*и*о*д* *р*а*б*о*т*ы*";
        replace(inParam);
    }

    public static void replace(String str) {
        char symbol_chr = 42;
        if (str == null)
            System.out.println("Пустая строка");
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == symbol_chr) {
                System.out.print("");
            } else {
                System.out.print(charArr[i]);
            }
        }
    }
}