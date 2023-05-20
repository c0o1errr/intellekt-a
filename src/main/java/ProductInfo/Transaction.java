package ProductInfo;

public class Transaction {
    private double price;
    private double tax = 1.2;

    public class TransactionItem {
        private double price;
        private String name;

        public TransactionItem() {
            name = "Default";
        }

        public TransactionItem(double price, String name) {
            if (price < 0) {
                this.price = 0;
            }
            this.price = price;
            this.name = name;
        }

        Transaction getTransaction() {
            return Transaction.this;
        }

        public void printInfo() {
            System.out.printf("Item: %s", name);
            printCheck(price);
        }
    }

    public double getPrice() {
        return price;
    }

    public Transaction() {
    }

    public double dealPrice() {
        return price * tax;
    }

    private void printCheck(double price) {
        System.out.print(String.format("%s price: %.2f USD\n", "Order", price));
        System.out.print(String.format("%s price: %.2f USD ", "Total", dealPrice()));
    }

    public void printCheck() {
        printCheck(price);
    }
}
