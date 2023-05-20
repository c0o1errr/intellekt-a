package LuxArrays;

public class CardCustomer extends Customer {
    public static int purchaseCount;
    public static int discountSize;
    public static String name;
    private String cardNumber;

    @Override
    public void customerInfo(String name) {
    }

    public CardCustomer(String name, String cardNumber, int purchaseCount) {
        super(name, purchaseCount);
        if (cardNumber.length() != 16 || cardNumber == null) {
            cardNumber = "0000 0000 0000 0000";
        }
        char[] newCardNumber = new char[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            newCardNumber[i] = cardNumber.charAt(i);
            if (newCardNumber[i] < minValue || newCardNumber[i] > maxValue) {
                cardNumber = "0000 0000 0000 0000";
            }
        }
    }
}
