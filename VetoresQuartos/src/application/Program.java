package application;

import entities.Room;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = read.nextInt();
        Room[] bedrooms = new Room[10];
        read.nextLine();
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.printf("Rent #%d%n", i + 1);
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("E-mail: ");
            String email = read.nextLine();
            System.out.print("Room: ");
            int number = read.nextInt();
            read.nextLine();

            bedrooms[number] = new Room(name, email, number);
            System.out.println();
        }

        System.out.println("Busy rooms: ");

        for (Room room : bedrooms) {
            if (room != null) {
                System.out.print(room);
            }
        }
        read.close();
    }
}
