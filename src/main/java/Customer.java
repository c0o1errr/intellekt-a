import java.util.HashMap;
import java.util.Map;

public class Customer {
    int id;
    String name;
    String phone;
    double purchaseCount;

    static HashMap<Integer, Customer> idName = new HashMap<>();

    public static void load(Customer[] customers) {
        /*for (Customer customer : customers) {
            idName.put(customer.id, customer);
        }*/

        for (int i = 0; i < customers.length; i++) {
            int k = customers[i].id;        // << по значению customers[i] вытащить id и записать в k
            idName.put(k, customers[i]);
        }
    }

    public static Customer getByld(int id) {
        return idName.get(id);
    }
}