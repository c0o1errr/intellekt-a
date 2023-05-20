import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysBase {
    public static void main(String[] args) {
        double[] first_arr = {12.2, 34.2, 36.32, 11.0, 43.3, 12.9};
        double[] second_arr = {12.2, 34.2, 36.32, 11.0, 43.3, 12.9};

        Array.setDouble(first_arr, 4, 12.33);
        Array.setDouble(first_arr, 5, 8.09);    // {12.2, 34.2, 36.32, 11.0, 12.33, 8.09}

        Array.setDouble(second_arr, 5, 12.33);  //  сменить в second_arr значение под индексом 5 на 12.33
        Array.setDouble(second_arr, 4, 8.09);  // {12.2, 34.2, 36.32, 11.0, 8.09, 12.33}

        System.out.println(Arrays.equals(first_arr, second_arr));  // false
        System.out.println(Arrays.compare(first_arr, second_arr));  // 1
        System.out.println(Array.getDouble(first_arr, 2)); // 36.32

        // так можно, но лучше Arrays.toString();
       /* for (int i = 0; i < first_arr.length; i ++) {
            System.out.print(first_arr[i] + " ");
        }*/

        System.out.println(Arrays.toString(first_arr));
    }
}

