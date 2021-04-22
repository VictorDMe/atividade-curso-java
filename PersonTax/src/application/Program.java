package application;

import entities.JuridicalPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = read.nextInt();
        System.out.println();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char payerType = read.next().charAt(0);
            read.nextLine();
            System.out.print("Name: ");
            String payerName = read.nextLine();
            System.out.print("Annual income: ");
            Double payerIncome = read.nextDouble();

            if (payerType == 'i') {
                System.out.print("Health expenditures: ");
                Double healthSpending = read.nextDouble();
                persons.add(new NaturalPerson(payerName, payerIncome, healthSpending));
            }
            else if (payerType == 'c') {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = read.nextInt();
                persons.add(new JuridicalPerson(payerName, payerIncome, numberOfEmployees));
            }
            System.out.println();
        }
        System.out.println("TAXES PAID: ");
        for (Person person : persons) {
            System.out.print(person);
        }
        System.out.println();

        double sum = 0;
        for (Person person : persons) {
            sum += person.tax();
        }
        System.out.printf("TOTAL TAXES: %.2f", sum);

    }
}