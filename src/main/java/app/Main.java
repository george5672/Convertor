
package app;

import java.util.Scanner;

public class Main {


    static double balance = 1000.00;

    public static void main(String[] args) {

        double amount = getAmount();


        validateAmount(balance, amount);
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void validateAmount(double currentBalance, double withdrawal) {
        if (withdrawal > currentBalance) {
            try {
                throw new FundsException("Insufficient funds!");
            } catch (FundsException ex) {

                System.out.println(ex.getMessage());
            }
        } else {

            balance = calculateNewBalance(currentBalance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid.%n" +
                    "Balance is USD %.2f%n", balance);
        }
    }


    private static double calculateNewBalance(double currentBalance, double withdrawal) {
        return currentBalance - withdrawal;
    }
}
