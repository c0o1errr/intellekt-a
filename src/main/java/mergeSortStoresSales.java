public class mergeSortStoresSales {
    public static void main(String[] args) {
        String[] country = {"Thailand", "Vietnam", "China", "Malaysia", "Japan", "Korea", "Laos"};
        double[] sales = {5.35, 6.87, 21.25, 8.47, 0, 4.21, 3.98};

        sortStoresSales(country, sales);
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

    public static void sortStoresSales(String[] names, double[] data) {
        if (names.length == 0 || data.length == 0) {
            System.out.println("Empty Data");
        } else if (names.length < data.length || names.length > data.length) {
            System.out.println("Corrupted Data");
        } else {
            String[] leftNames = new String[names.length / 2];
            String[] rightNames = new String[names.length - leftNames.length];
            double[] leftData = new double[data.length / 2];
            double[] rightData = new double[data.length - leftData.length];

            for (int i = 0; i < names.length; i++) {
                if (i < leftNames.length)
                    leftNames[i] = names[i];
                else
                    rightNames[i - leftNames.length] = names[i];
            }

            for (int i = 0; i < data.length; i++) {
                if (i < leftData.length)
                    leftData[i] = data[i];
                else
                    rightData[i - leftData.length] = data[i];
            }

            if (rightData.length > 1 && rightNames.length > 1) {
                sortStoresSales(leftNames, leftData);
                sortStoresSales(rightNames, rightData);
            }

            int leftId = 0;
            int rightId = 0;
            /*int leftNameId = 0;
            int rightNameId = 0*/
            ;
            for (int i = 0; i < data.length; ++i) {
                if (leftId == leftData.length && rightId < rightData.length) {
                    names[i] = rightNames[rightId];
                    data[i] = rightData[rightId++];
                } else if (rightId == rightData.length && leftId < leftData.length) {
                    names[i] = leftNames[leftId];
                    data[i] = leftData[leftId++];
                } else {
                   /* if (leftData[leftId] < rightData[rightId]) {
                        names[i] = leftNames[leftId] ;
                        data[i] = leftData[leftId++];
                    } else {
                        names[i] = rightNames[rightId];
                        data[i] = rightData[rightId++];
                    }*/
                    names[i] =(leftData[leftId] <= rightData[rightId]) ? leftNames[leftId] : rightNames[rightId];
                    data[i] = (leftData[leftId] <= rightData[rightId]) ? leftData[leftId++] : rightData[rightId++];
                }
            }
        }
    }
}



