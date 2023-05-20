package randommoney;

import java.util.Random;
import static java.lang.Math.sin;

public class RandomMoney {
    double price;

    public double getPrice() {
        return price;
    }

    public void sale(int quant, double time){
        double result;
        price = 5*sin(time*1/2);
        result = quant * price;
        if(result > 0) {
            System.out.printf("The company has earned USD %.2f ", result);
        } else if ( result == 0) {
            System.out.print("The company did not earn anything and did not lose on the sale ");
        } else {
            System.out.printf("The company has lost USD %.2f ", result);
        }
    }

    public void testSale() {
        Random rnd = new Random();
        RandomMoney rndMoney = new RandomMoney();
        for (int i = 0; i < 3; i++) {
            rndMoney.sale(rnd.nextInt(), rnd.nextDouble(0, 50));
        }
    }

    public static void main(String[] args) {
        RandomMoney rndMoney = new RandomMoney();
        rndMoney.testSale();
    }
}
