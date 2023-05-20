import java.util.ArrayList;

public class ListUtilGenericMethod {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ListUtil.print(ints);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.0);
        doubles.add(4.0);
        ListUtil.print(doubles);
        System.out.println(ListUtil.minNumber(ints, doubles));  // чтоб заработало, надо раскомментить метод с 2 параметрами
        System.out.println(ListUtil.minNumber(ints, doubles));
    }

    class ListUtil {
        static void print(ArrayList list) {
            for (var item : list)
                System.out.println(item.toString());
        }

        static <T1 extends Number & Comparable,
                T2 extends Number & Comparable> Number minNumber(ArrayList<T1> list1, ArrayList<T2> list2) {
            Number min = getMinNumber(list1, list1.get(0));
            min = getMinNumber(list2, min);
            return min;
        }

        private static <T extends Number & Comparable> Number getMinNumber(ArrayList<T> list, Number min) {
            for (var item : list)
                if (item.doubleValue() < min.doubleValue()) min = item;
            return min;
        }


        static <T extends Number & Comparable> T min(ArrayList<T> list1, ArrayList<T> list2) {
            T min = getMin(list1, list1.get(0));
            min = getMin(list2, min);
            return min;
        }

        private static <T extends Number & Comparable> T getMin(ArrayList<T> list, T min) {
            for (var item : list)
                if (item.compareTo(min) < 0) min = item;
            return min;
        }
    }
}
