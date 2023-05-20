package com.intellekta;

import java.util.Scanner;

public class WindowResolver {

    public static void main(String[] args){
        //int[] services = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while (true){
            System.out.println("Выбирете услугу от 1 до 10: ");
            int idxServices = getUserInput();
            switch (idxServices){
                case 1,4,7:
                    System.out.println("По вашему вопросу обратитесь в окно №26");
                    break;
                case 2,3,5,6:
                    System.out.println("По вашему вопросу обратитесь в окно №27");
                    break;
                case 8,9,10:
                    System.out.println("По вашему вопросу обратитесь в окно №28");
            }
        }
    }

    static Scanner in = new Scanner(System.in);
    private static int getUserInput(){
        return in.nextInt();
    }
}
