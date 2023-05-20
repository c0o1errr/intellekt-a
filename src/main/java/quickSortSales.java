public class quickSortSales {
    public static void main(String[] args) {
        String[] country = {"Thailand", "Vietnam", "China", "Malaysia", "Japan", "Korea", "Laos"};
        double[] sales = {5.35, 6.87, 21.25, 8.47, 0, 4.21, 3.98};

        int low = 0;
        int high = sales.length - 1;

        System.out.println(low + " " + high);
        sortStoresSales(country, sales, low, high);
        printData(country, sales);
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }

    public static void sortStoresSales(String[] names, double[] data, int low, int high) {
        if (low < high) {
            int position = partition(names, data, low, high);
            sortStoresSales(names, data, low, position - 1);
            sortStoresSales(names, data, position + 1, high);
        }
    }

    public static int partition(String[] names, double[] data, int low, int high) {
        int pivot = (int) data[high];
        int swapPosition = low;
        for (int i = low; i <= high - 1; i++) {
            if (data[i] <= pivot) {
                swapElements(swapPosition, i, data, names);
                swapPosition++;
            }
        }
        swapElements(swapPosition, high, data, names);
        return swapPosition;
    }

    public static void swapElements(int position1, int position2, double[] array, String[] strArr) {
        double temp =  array[position1];
        String strTemp = strArr[position1];
        array[position1] = array[position2];
        array[position2] = temp;
        strArr[position1] = strArr[position2];
        strArr[position2] = strTemp;
    }
}