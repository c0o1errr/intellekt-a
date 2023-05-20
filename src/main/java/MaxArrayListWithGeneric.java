import java.util.ArrayList;

public class MaxArrayListWithGeneric<T extends  Comparable> {
    private ArrayList<T> list = new ArrayList<T>();

    ArrayList<T> getList() {
        return list;
    }

    T max() {
        T max = list.get(0);
        for (var value : list) {
            if (value.compareTo(max) > 0)
                max = value;
        }
        return max;
    }
}

class GenericDemo {
    public static void main(String[] args) {
        MaxArrayListWithGeneric<Integer> genericHolderInt = new MaxArrayListWithGeneric<>();
        /*for(int i = 0; i < 6; i++){
            genericHolder.getList().add(i);
        }*/
        genericHolderInt.getList().add(1);
        genericHolderInt.getList().add(2);
        System.out.println(genericHolderInt.max());

        MaxArrayListWithGeneric<String> genericHolderString = new MaxArrayListWithGeneric<>();
        genericHolderString.getList().add("3");
        genericHolderString.getList().add("4");
        System.out.println(genericHolderString.max());

        MaxArrayListWithGeneric<Double> genericHolderDouble = new MaxArrayListWithGeneric<>();
        genericHolderDouble.getList().add(5.0);
        genericHolderDouble.getList().add(7.0);
        System.out.println(genericHolderDouble.max());
    }
}
