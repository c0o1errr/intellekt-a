package LuxArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest extends Customer {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Customer customer = new CashCustomer("Lora", "1515548125", 5);
        shopInfo();
    }

    public static Shop shopInfo() {
        System.out.println("Shop data");
        do {
            if (sc.nextLine().equals("exit")) {
                break;
            } else {
                ArrayList list = new ArrayList(5);
                for (int i = 0; i < 5; i++) {
                    String j = sc.nextLine();
                    list.add(j);
                }
                System.out.println(list);
            }
        } while (true);
        return null;
    }

    public CustomerTest(String name, int purchaseCount) {
        super(name, purchaseCount);
    }

    @Override
    public void customerInfo(String name) {
    }
}
