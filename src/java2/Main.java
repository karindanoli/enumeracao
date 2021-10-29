package java2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("email: ");
        String email = sc.next();
        System.out.print("Birth date ");
        Date birthDate = sdf.parse(sc.next()); //parse converte data

        Cliente cliente = new Cliente(name, email, birthDate);//order associado ao cliente

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());// converte o valor pra ver a enumeração
        Order order = new Order(new Date(),status,cliente);

        System.out.println(" How many items to this order?");
        int x = sc.nextInt();
        for (int i=1; i<=x;i++){
            System.out.println( "Enter # " + i + "   item data: ");
            System.out.print(" Product name:");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print(" Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName,productPrice);
            OrderItem it = new OrderItem (quantity,productPrice,product); //associou o produto ao pedido
            //associar o order item a minha lista de pedidos

            order.addItem(it);

        }

        System.out.println();
        System.out.println(order);
        sc.close();
    }
}
