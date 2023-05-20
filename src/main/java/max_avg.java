public class max_avg {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 4, 9, 1, 5, 12, 6, 3, 2, 7};

        // Вычисление Максимального значения
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println(" --Maximum: " + max + ";");

        // Вычисление Среднего значения
        int N = array.length;
        double sum = 0.0;
        double avg;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        avg = sum / N;
        System.out.println(" --Average: " + avg + ";");

        // Копирование одного массива в другой
        int[] copy_array = new int[N];
        System.out.print(" --Copy array:");
        for (int i = 0; i < array.length; i++) {
            copy_array[i] = array[i];
            System.out.print(" " + copy_array[i]);
        }
        System.out.print(";");

        // Перестановка элементов массива в обратном порядке

        for (int i = 0; i < N/2; i++) {
            int temp = array[i];
            array[i] = array[N-1-i];
            array[N-1-i] = temp;
        }

        System.out.print("\n --New array:");
        for (int i = 0; i < N; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.print(";");
    }
}
