package A; // добавить пакет A

import static A.Triangle.*;

public class Main {
    public static void main(String[] args) {
        double firstSquare = Square(true, 10, 15);
        double secondSquare = Square(false, 12, 14);
        double thirdSquare = Square(false, 5, height);

        System.out.println(firstSquare);
        System.out.println(secondSquare);
        System.out.println(thirdSquare);
    }
}

