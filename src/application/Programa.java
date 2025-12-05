package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Enum.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Programa {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");

        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Birth Date (DD/MM/YYYY):");
        String birthStr = sc.nextLine();
        Date birthDate = sdf.parse(birthStr);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data");

        
        System.out.println("Order status:");
        String statusStr = sc.nextLine().trim().toUpperCase();
        OrderStatus status = OrderStatus.valueOf(statusStr);
       
        System.out.println("Order moment (DD/MM/YYYY HH:MM:SS):");
        String momentStr = sc.nextLine();
        Date moment = sdfMoment.parse(momentStr);

       

        Order order = new Order(moment, status, client);

        System.out.println("How many items to this order?");
        int n = Integer.parseInt(sc.nextLine()); // leitura correta

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");

            System.out.println("Product name: ");
            String productName = sc.nextLine();

            System.out.println("Product price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.println("Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            Product product = new Product(productName, price);
            OrderItem item = new OrderItem(quantity, price, product);

            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
