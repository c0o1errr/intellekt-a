public class mergeSort {
    public static void main(String[] args) {
        int array[] = {1, 4, 7, 0, 3, 6, 2, 5, 9};

        mergeSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("{");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("\b\b}");
    }

    static void mergeSort(int[] array) {
        int[] leftArray = new int[array.length / 2];
        int[] rightArray = new int[array.length - leftArray.length];

        for (int i = 0; i < array.length; i++) {
            if (i < leftArray.length)
                leftArray[i] = array[i];
            else
                rightArray[i - leftArray.length] = array[i]; //  1 = 3; 2 = 6
        }

        if(rightArray.length > 1){
            mergeSort(leftArray);
            mergeSort(rightArray);
        }

        int leftId = 0;
        int rightId = 0;

        for(int i = 0; i < array.length; i++) {
            if(leftId == leftArray.length && rightId < rightArray.length)
                array[i] = rightArray[rightId++];
            else if (rightId == rightArray.length && leftId < leftArray.length)
                array[i] = leftArray[leftId++];
            else
                array[i] = (leftArray[leftId]< rightArray[rightId])?leftArray[leftId++]:rightArray[rightId++];
        }
    }
}
