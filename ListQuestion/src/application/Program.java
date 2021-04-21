package application;

import entitites.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = read.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; n > i; i++) {
            System.out.println();
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("Id: ");
            int id = read.nextInt();
            read.nextLine();
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Salary: ");
            double salary = read.nextDouble();

            Employee newEmployee = new Employee(id, name, salary);
            employeeList.add(newEmployee);
        }
        System.out.println();

        System.out.print("Enter the employee id that will have salary increased: ");
        int idSalary = read.nextInt();

        Employee result = employeeList.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (result != null) {
            System.out.print("Enter the percentage: ");
            double percentage = read.nextDouble();
            result.upSalary(percentage);
        }
        else {
            System.out.println("This id does not exist!");
        }

        System.out.printf("%nList of employees%n");

        for (Employee employees : employeeList) {
            System.out.print(employees);
        }

        read.close();
    }
}