package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitites.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = read.nextLine();
        System.out.print("E-mail: ");
        String email = read.next();
        System.out.print("Birth date (dd/mm/yyyy): ");
        Date birthDate = sdf.parse(read.next());

        System.out.println();
        // Fim da primeira parte. Entrada dos dados do cliente.

        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(read.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int loop = read.nextInt();
        System.out.println();
        //Fim da segunda parte. Entrada do Status do pedido e quantos produtos foram solicitados.

        for (int i = 0; i < loop; i++) {
            System.out.printf("Enter #%d item data: %n", i + 1);
            System.out.print("Product name: ");
            read.nextLine();
            String productName = read.nextLine();
            System.out.print("Product price: ");
            Double productPrice = read.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = read.nextInt();

            Product product = new Product(productName, productPrice);

            order.addItem(new OrderItem(productQuantity, productPrice, product));

            System.out.println();
        }
        //Fim da terceira parte. Entrada de todos os itens ao pedido;

        System.out.println("Order summary:");
        System.out.print(order);
    }
}
