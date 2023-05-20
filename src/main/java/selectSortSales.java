public class selectSortSales {
    public static void main(String[] args) {
        String[] country =  {"Thailand", "Vietnam", "China", "Malaysia", "Japan", "Korea", "Laos"};
        double[] sales = {5.35, 6.87, 21.25, 8.47, 0, 4.21, 3.98};
        //  0 ,   1  ,  2 ,     3,  4 , 5 ,   6
        sortSales(country, sales);
        if (country.length == sales.length) {
            printData(country, sales);
        }
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }

    public static void sortSales(String[] names, double[] data) {
        System.out.println(names.length + " " + data.length);
        if (names.length == 0 || data.length == 0) {
            System.out.println("Empty Data");
        } else if (names.length < data.length || names.length > data.length) {
            System.out.println("Corrupted Data");
        } else {
            for (int i = 1; i < data.length; ++i) {
                int maxId = 0; // индекс максимального элемента
                int nameId = 0;
                String maxName = names[nameId];
                double max = data[maxId]; // значение максимального элемента
                for (int j = 0; j < data.length - i; ++j) {
                    if (data[j] > max) {
                        max = data[j];
                        maxId = j;
                        maxName = names[j];
                        nameId = j;
                    }
                }
                data[maxId] = data[data.length - i];
                data[data.length - i] = max;
                names[nameId] = names[names.length - i];
                names[names.length - i] = maxName;
            }
        }
    }
}

