import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListBase {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            arrayList.add(i + 1);
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for (Object i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator i = arrayList.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(null);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(j + " ");
        }

        Vector vector = new Vector();
    }
}
