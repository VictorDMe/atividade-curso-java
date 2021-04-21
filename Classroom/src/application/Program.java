package application;

import entities.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name;
        int age;
        char gender;
        double height, weight;

        System.out.print("Nome: ");
        name = read.nextLine();
        System.out.print("Idade: ");
        age = read.nextInt();
        System.out.print("Gênero (m/f): ");
        gender = read.next().charAt(0);
        System.out.print("Altura: ");
        height = read.nextDouble();
        System.out.print("Massa: ");
        weight = read.nextDouble();
        System.out.println();

        Student Antunes = new Student(name, age, gender, height, weight);
        System.out.print(Antunes);

        read.close();
    }
}
