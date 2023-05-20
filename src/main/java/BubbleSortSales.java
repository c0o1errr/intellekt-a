public class BubbleSortSales {
    public static void main(String[] args) {
        String[] country = {"Thailand", "Vietnam", "China", "Malaysia", "Japan", "Korea", "Laos"};
        double[] sales = {5.35, 6.87, 21.25, 8.47, 0, 4.21, 3.98};

        sortSales(country, sales);
        printData(country, sales);
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }

    public static void sortSales(String[] names, double[] data) {
        if (names.length != data.length) {
            System.out.println("Corrupted Data");
        } else if (names.length == 0 || data.length == 0) {
            System.out.println("Empty Data");
        } else {
            for (int i = 1; i < data.length; ++i) {
                for (int j = 0; j < data.length - i; ++j) {
                    if (data[j] > data[j + 1]) {
                        double max = data[j];
                        String maxName = names[j];
                        data[j] = data[j + 1];
                        names[j] = names[j + 1];
                        data[j + 1] = max;
                        names[j + 1] = maxName;
                    }
                }
            }
        }
    }
}
