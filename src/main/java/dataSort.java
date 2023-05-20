import java.util.Arrays;

public class dataSort {
    public static void main(String[] args) {
        int[][] inArr = new int[][]{{2, 3, 3}, {5, 1, 2}, {1, 1, 2}, {8, 4, 3}};
        sort(inArr);
    }

    public static void sort(int data[][]) {
        if (data == null || data.length == 0) {
            System.out.print("Empty data at index ");
            return;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null || data[i].length != 3) {
                System.out.println("Unavailable data at index " + i);
                return;
            }
        }
        for (int k = 0; k < data.length - 1; k++) {
            for (int j = k + 1; j < data.length; j++) {
                if (data[k][0] > data[j][0]) {
                    int[] temp = data[k];
                    data[k] = data[j];
                    data[j] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}

//    private static void printData(int[][] data) {
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == null) {
//                System.out.println("null");
//            } else {
//                for (int j = 0; j < data[i].length; j++) {
//                    System.out.print(data[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
