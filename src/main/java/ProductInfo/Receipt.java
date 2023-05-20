package ProductInfo;

public class Receipt {

    public static void printReceipt(String[] ProductInfo) {
        Transaction transaction = new Transaction();
        for (int i = 0; i < ProductInfo.length; i++) {
            System.out.println("Item: " + ProductInfo[i] + "," + transaction.getPrice() + ": USD");
        }
    }

    public static void printTransactionInfo() {
        Transaction transaction = new Transaction();
        Transaction.TransactionItem transactionItem = transaction.new TransactionItem();
        transaction.printCheck();
    }
}
