package LuxArrays;

import com.intellekta.staff.Staff;
import com.sun.jdi.PathSearchingVirtualMachine;

public class CashCustomer extends Customer {
    public static int purchaseCount;
    public static int discountSize;
    private String documentNumber;
    public static String name;

    @Override
    public void customerInfo(String name) {
        System.out.printf("Customer < %s > (passport: < %s >) has a discount < %d >\n", name, documentNumber, discountSize);
    }

    public CashCustomer(String name, String documentNumber, int purchaseCount) {
        super(name, purchaseCount);
        if (documentNumber.length() != 10 || documentNumber == null) {
            documentNumber = "0000 000000";
        }
        char[] newDocumentNumber = new char[documentNumber.length()];
        for (int i = 0; i < documentNumber.length()-1; i++) {
            newDocumentNumber[i] = documentNumber.charAt(i);
            if (newDocumentNumber[i] < minValue || newDocumentNumber[i] > maxValue) {
                documentNumber = "0000 000000";
            }
        }
    }
}
