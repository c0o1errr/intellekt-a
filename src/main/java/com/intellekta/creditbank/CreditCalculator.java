package com.intellekta.creditbank;

import java.util.Scanner;

public class CreditCalculator {
    final static Scanner sc = new Scanner(System.in);
    static char space = 32;
    static String lastName;  // фамилия
    static String firstName; // имя
    static String secondName; // отчество
    static double sum;  // сумма кредита
    static int loanMaturity; // срок погашения/кредита
    static double interestRate;  // процентная ставка

    // конструктор
    public CreditCalculator() {
        printClient();
        printCreditAgreement(sum, loanMaturity, interestRate);
    }

    public static void printCreditAgreement(double sum, int period, double percent) {
        double Pl; // размер ежемесячного платежа
        double Pgod; // размер годовой процентной ставки

        Pgod = percent / (12 * 100);
        double down = Math.pow((1+Pgod), -period);
        Pl = sum * (Pgod/(1-down));
        System.out.printf("Сумма ежемесячного платежа: %.2f%n",Pl);
    }

    public static void printClient() {
        do {
            System.out.println("Введите фамилию: ");
            lastName = sc.nextLine();
            if (lastName == null || lastName.length() == 0 || lastName.equals(" ")) {
                System.out.println("Lastname is incorrect. It must be not empty string");
            } else {
                break;
            }
        } while (true);
        do {
            System.out.println("Введите имя: ");
            firstName = sc.nextLine();
            if (firstName == null || firstName.length() == 0 || firstName.equals(" ")) {
                System.out.println("Firstname is incorrect. It must be not empty string");
            } else {
                break;
            }
        } while (true);
        System.out.println("Введите отчество: ");
        secondName = sc.nextLine();
        do {
            System.out.println("Введите процентную ставку: ");
            interestRate = sc.nextDouble();
            if (interestRate < 0 || interestRate == space) {
                System.out.println("Interest rate is incorrect. It must be strictly positive number»;");
            } else {
                break;
            }
        } while (true);

        do {
            System.out.println("Введите сумму кредита: ");
            sum = sc.nextDouble();
            if (sum < 0 || sum == space) {
                System.out.println("Interest rate is incorrect. It must be strictly positive number»;");
            } else {
                break;
            }
        } while (true);

        do {
            System.out.println("Введите срок кредита: ");
            loanMaturity = sc.nextInt();
            if (loanMaturity < 0 || loanMaturity == space) {
                System.out.println("Interest rate is incorrect. It must be strictly positive number»;");
            } else {
                break;
            }
        } while (true);
    }
}
