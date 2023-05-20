import java.util.LinkedList;

public class dimBioLinkedList {
    public static void main(String[] args) {
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
        // dimBio.remove("Hello World!"); // можно удалить и по названию и по id
    }
}
