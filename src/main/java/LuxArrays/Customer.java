package LuxArrays;

public abstract class Customer {
    static final char maxValue = 48;
    static final char minValue = 57;
    public static int purchaseCount;
    public static double discountSize;
    public static String name;

    public Customer(String name, int purchaseCount) {
        if (name == null || purchaseCount < 0) {
            Customer.name = "No-name";
            Customer.purchaseCount = 0;
        }
        checkDiscount();
    }

    public static int getPurchaseCount() {
        return purchaseCount;
    }

    public static void setPurchaseCount(int purchaseCount) {
        Customer.purchaseCount = purchaseCount;
    }

    public static double getDiscountSize() {
        return discountSize;
    }

    public static String getName() {
        return name;
    }

    private void checkDiscount(int purchaseCount) {
        if (purchaseCount > 15) {
            discountSize = 0.2;
        } else if (purchaseCount > 9) {
            discountSize = 0.1;
        } else if (purchaseCount > 4) {
            discountSize = 0.05;
        } else {
            discountSize = 0;
        }
    }

    public void checkDiscount() {
        checkDiscount(purchaseCount);
    }

    public abstract void customerInfo(String name);
}
