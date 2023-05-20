package LuxArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static final Scanner sc = new Scanner(System.in);
    final String shopCustomers;

    public Shop(String shopCustomers) {
        this.shopCustomers = shopCustomers;
    }

    public static void printShopSummary() {
        System.out.println();
    }

    public static ArrayList createShopInfo() {
        System.out.println("Shop data");
        do {
            if (sc.nextLine().equals("exit")) {
                break;
            } else {
                ArrayList shop = new ArrayList(5);
                for (int i = 0; i < 5; i++) {
                    String j = sc.nextLine();
                    shop.add(j);
                }
                return shop;
            }
        } while (true);
        return null;
    }
}