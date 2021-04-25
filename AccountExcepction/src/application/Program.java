package application;

import model.Account;
import model.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        Integer number = read.nextInt();
        System.out.print("Holder: ");
        read.nextLine();
        String holder = read.nextLine();
        System.out.print("Initial balance: ");
        Double balance = read.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = read.nextDouble();
        System.out.println();

        Account account = new Account(number, holder, balance, withdrawLimit);

        while (true) {
            try {
                System.out.print("Enter amount for withdraw: ");
                account.withdraw(read.nextDouble());
                System.out.printf("New balance: %.2f%n", account.getBalance());
                break;
            } catch (AccountException e) {
                System.out.println("Error in withdraw: " + e.getMessage());
                System.out.println();
            }
        }
    }
}