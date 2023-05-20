import java.util.Arrays;

public class ArrayWithNullToTheEnd {
    public static void main(String[] example) {
        Double[] dArray = {2.3, 5.6, null, 1.3, 4.35, 0.0, 6.34, null, 3.6, 7.8, 4.44};
        moveNullToTheEnd(dArray);
    }

    public static void moveNullToTheEnd(Double[] arr) {
        Double[] temp = new Double[arr.length];
        int counter = 0;
        int nullcounter = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                temp[nullcounter] = null;
                nullcounter--;
            } else {
                temp[counter] = arr[i];
                counter++;
            }
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
}

