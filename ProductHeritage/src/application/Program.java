package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        Integer productQuantity = read.nextInt();
        System.out.println();

        for (int i = 0; i < productQuantity; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Commom, used or imported (c/u/i)? ");
            char productType = read.next().charAt(0);
            read.nextLine();

            System.out.print("Name: ");
            String productName = read.nextLine();

            System.out.print("Price: ");
            Double productPrice = read.nextDouble();

            //Se o produto for usado.
            if (productType == 'u') {
                System.out.print("Manufacture date: ");
                Date productDate = sdf.parse(read.next());
                productList.add(new UsedProduct(productName, productPrice, productDate));
            }

            //Se o produto for importado.
            else if (productType == 'i') {
                System.out.print("Customs fee: ");
                Double productCustomsFee = read.nextDouble();
                productList.add(new ImportedProduct(productName, productPrice, productCustomsFee));
            }

            //Se o produto for comum.
            else {
                productList.add(new Product(productName, productPrice));
            }
            System.out.println();
        }

        System.out.println("PRICE TAGS:");
        for (Product product : productList) {
            System.out.print(product.priceTag());
        }
    }
}
