// TODO number делится на 3 и не делится на 5, в сумме числа дают меньше 10

public class Input01000 {
    public static void main(String[] args) {
        final int LIMIT = 1000;

        for (int i = 0; i <= LIMIT; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                int sum = 0;
                int temp = i;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /=10;
                }
                if(sum < 10) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
