import java.util.ArrayList;

public class WildcardClass<T extends Number> {
    boolean same(WildcardClass<?> object) {      // при <T> будет ошибка1, <?> wildcard снять ограничения T
        return this == object;
    }

    // <?> (wildcard) тоже можно ограничить (ограничения сверху)
    Number min(ArrayList<T> list1, ArrayList<? extends Number> list2) {     // без extends Number будет ошибка2
        Number min = getMin(list1, list1.get(0));
        min = getMin(list2, min);
        return min;
    }

    private Number getMin(ArrayList<? extends Number> list, Number min) {
        for (var item : list)
            if (item.doubleValue() < min.doubleValue()) min = item;  // < ошибка2
        return min;
    }

    boolean equal(ArrayList<T> list1, ArrayList<? super T> list2) {
        boolean result = list1.size() == list2.size();
        if (result) {
            for (int i = 0; result && i < list1.size(); i++) {
                result = list1.get(i).equals(list2.get(i));
            }
        }
        return result;
    }
}

class WildCardDemo {
    public static void main(String[] args) {
        WildcardClass<Integer> intGeneric = new WildcardClass<>();
        WildcardClass<Number> numberGeneric = new WildcardClass<>(); // < ошибка1
        intGeneric.same(numberGeneric);
    }
}


