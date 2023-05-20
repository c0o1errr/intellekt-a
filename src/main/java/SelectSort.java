public class SelectSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 0, 3, 6, 2, 5};

        for (int i = array.length - 1, max, maxId; i > 0; i--) {
            maxId = 0;
            max = array[maxId];

            for (int j = 1; j <= i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }

            array[maxId] = array[i];
            array[i] = max;
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("{");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("\b\b}");
    }
}
