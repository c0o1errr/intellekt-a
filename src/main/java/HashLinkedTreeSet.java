import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashLinkedTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<Integer>();
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();

        myHashSet.add(2);
        myHashSet.add(1);
        myHashSet.add(3);
        myHashSet.add(4);

        myLinkedHashSet.add(2);
        myLinkedHashSet.add(4);
        myLinkedHashSet.add(3);
        myLinkedHashSet.add(1);

        myTreeSet.add(2);
        myTreeSet.add(1);
        myTreeSet.add(3);
        myTreeSet.add(4);

        System.out.println("myHashSet");
        for (int i : myHashSet)
            System.out.println(i);
        System.out.println("myLinkedHashSet");
        for (int i : myLinkedHashSet)
            System.out.println(i);
        System.out.println("myTreeSet");
        for (int i : myTreeSet)
            System.out.println(i);
    }
}

