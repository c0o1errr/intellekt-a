import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayMapHashSet {
    public static void main(String[] args) {
        // Неизменяемый массив String, int, double, char
        int[] intArr = new int[5];
        String str = "Привет мир!";  // чтобы разбить строку на массив, можно использовать метод split()
        String[] newStr = str.split(" "); // str {"Привет", "мир!"}
        System.out.println(newStr[1]); // Привет
        String[] strArr = {"Привет", "Мир"};
        double[] doubleArr;

        // Изменяймый массив ArrayList, Vector, List
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("4");
        System.out.println(arrayList.size());

        Vector vector = new Vector();
        vector.add(0);
        vector.add("1");
        vector.firstElement();
        vector.lastElement();

        //  Очереди/Связанные списки Stack, Queue, Deque, LinkedList
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        System.out.println(stack);
        System.out.println(stack.pop());

        Queue queue = new ArrayBlockingQueue(3);
        queue.add(0);
        queue.add(1);
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.poll());

        Deque deque = new ArrayDeque();
        deque.add(0);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        System.out.println(deque);
        System.out.println(deque.pollFirst() + " " + deque.pollLast());

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Dmitry");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Bangkok");

        LinkedList<String> dimBio = new LinkedList<>();
        dimBio.add(str1);
        dimBio.add(str3);
        dimBio.add(1, str2);
        dimBio.add(str4);

        System.out.println(dimBio);
        dimBio.remove(0);
        System.out.println(dimBio);

        // Ассоциативные массивы, HashMap
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("+7 999 999 99 99", "Petrov A.A");
        phoneBook.put("+7 999 888 88 88", "Sidorov V.V");
        phoneBook.put("+7 999 777 777 77", "Kozlov K.K");

        System.out.println(phoneBook.containsKey("+7 999 999 99 99"));
        System.out.println(phoneBook.containsValue("Kozlov K.K"));

        // Отсортированные ассоциативные массивы
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Коллекции типа множество
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
