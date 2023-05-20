public class maxAboveAverage {
    public static void main(String[] args) {
        int[] arr = {0,1,-15,2,3,4,5};
        maxAboveAverage(arr);
    }
    public static void maxAboveAverage(int[] data) {
        if (data.length > 0) {
            int max = data[0], sum = 0, average;
            for (int i = 0; i < data.length; i++) {
                if (data[i] >= max)
                    max = data[i];
                sum += data[i];
            }
            average = sum / data.length;
            System.out.println(sum);
            System.out.println(max / average);
        } else {
            System.out.println("Data Error");
        }
    }
}
