import java.util.ArrayList;
import java.util.RandomAccess;

public class GenericExtention<T extends Number> {
    double sum(ArrayList<T> list) {
        double result = 0;
        for (var item : list) result += item.doubleValue();
        return result;
    }
}

class GenericExtentionDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);

        GenericExtention<Number> nested = new GenericExtention<>();
        System.out.println(nested.sum(numbers));
        // System.out.println(nested.sum(doubles));         ошибка
    }
}
