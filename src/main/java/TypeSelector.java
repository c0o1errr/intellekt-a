
public class TypeSelector {
    public static void main(String[] args) {
        Long long_one = 10500L;
        System.out.println(selectClass(127L));
        //selectClass(long_one);
    }

    public static Class selectClass(Long longIn) {
        if (longIn == null) {
            return Object.class;
        }
        if ((longIn >= Byte.MIN_VALUE && longIn <= Byte.MAX_VALUE)) {
            return Byte.class;
        } else if (longIn >= Short.MIN_VALUE && longIn <= Short.MAX_VALUE) {
            return Short.class;
        } else if (longIn >= Integer.MIN_VALUE && longIn <= Integer.MAX_VALUE) {
            return Integer.class;
        } else {
            return Long.class;
        }
    }
}



