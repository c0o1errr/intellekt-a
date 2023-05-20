import java.util.Arrays;

public class SortingUtil {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 9, 9, 1, 3, 6, 7, 2};
        Double[] dArray = {7.0, 1.0, null, 6.0, 3.0, 5.0, null, 0.0, 4.0, 2.0};
        System.out.print("Отсортированный int массив: ");
        sortInts(array);
        intPrint(array);

        System.out.print("Отсортированный double массив: ");
        sortDoubles(null);
    }

    public static void sortDoubles(Double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            System.out.println("Empty Data");
            return;
        }

        // Создаю временный массив tempArr, чтобы сдвинуть все null в конец
        Double[] tempArr = new Double[dArr.length];
        int start = 0;
        int end = dArr.length - 1;

        for (int i = 0; i < dArr.length; i++) {
            if (dArr[i] == null) {
                tempArr[end] = null;
                end--;
            } else {
                tempArr[start] = dArr[i];
                start++;
            }
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != null) {
                dArr[i] = tempArr[i];
            } else {
                break;
            }
        }
        //dArr = tempArr;
        //     System.out.println("Массив с null в конце: " + Arrays.toString(dArr)); // для проверки, что все получилось

        // сортирую
        for (int i = 1; i < dArr.length; ++i) {
            for (int j = 0; j < dArr.length - i; ++j)
                if (dArr[j] > dArr[j + 1]) {
                    double max = dArr[j];
                    dArr[j] = dArr[j + 1];
                    dArr[j + 1] = max;
                }
        }
        doublePrint(dArr);
    }

    public static void sortInts(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Empty Data");
        }

        int[] leftArray = new int[arr.length / 2];
        int[] rightArray = new int[arr.length - leftArray.length];

        for (int i = 0; i < arr.length; i++) {
            if (i < leftArray.length) leftArray[i] = arr[i];
            else rightArray[i - leftArray.length] = arr[i];
        }

        if (rightArray.length > 1) {
            sortInts(leftArray);
            sortInts(rightArray);
        }

        int leftId = 0;
        int rightId = 0;

        for (int i = 0; i < arr.length; i++) {
            if (leftId == leftArray.length && rightId < rightArray.length) arr[i] = rightArray[rightId++];
            else if (rightId == rightArray.length && leftId < leftArray.length) arr[i] = leftArray[leftId++];
            else arr[i] = (leftArray[leftId] < rightArray[rightId]) ? leftArray[leftId++] : rightArray[rightId++];
        }
    }

    private static void intPrint(int[] array) {
        System.out.print("{");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("\b\b}");
    }

    private static void doublePrint(Double[] doubleArr) {
        System.out.print("{");
        for (double d : doubleArr) {
            System.out.print(d + ", ");
        }
        System.out.println("\b\b}");
    }
}


//Пытаюсь переделать Double в double
/*
        double[] newArr = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            if (dArr[i] != null) {
                newArr[i] = dArr[i];
            } else {
                newArr[i] = 0.0;
            }
        }
*/