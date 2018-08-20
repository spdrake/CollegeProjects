//Definition of the class ShoppingCartPrinter
import java.util.Scanner;

public class ShoppingCartPrinter {

    // Definition of the main method

    public static void main(String[] args) {



        // Create an object for the Scanner class

        Scanner sc = new Scanner(System.in);

        // Create an object item1 for the

        // ItemToPurchase() method.

        ItemToPurchase item1 = new ItemToPurchase();

        // Create an object item2 for the

        // ItemToPurchase() method.

        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 1");

        // Read the item name using nextLine() method.

        System.out.println("Enter the item name:");

        item1.setName(sc.nextLine());

        // Read the price of the item using nextInt()

        // and nextLine() method.

        System.out.println("Enter the item price:");

        item1.setPrice(sc.nextInt());

        sc.nextLine();

        // Read the quantity of the item using nextInt()

        // and nextLine() method.

        System.out.println("Enter the item quantity:");

        item1.setQuantity(sc.nextInt());

        sc.nextLine();

        // Read the name,price, and quantity

        // of the item2.

        System.out.println("\nItem 2");

        System.out.println("Enter the item name:");

        item2.setName(sc.nextLine());

        System.out.println("Enter the item price:");

        item2.setPrice(sc.nextInt());

        sc.nextLine();

        System.out.println("Enter the item quantity:");

        item2.setQuantity(sc.nextInt());

       // sc.nextLine();

        //Print the details of the item1.

        System.out.println("\nTOTAL COST");

        System.out.println(item1.getName() + " "

                +item1.getQuantity() + " @ $" +item1.getPrice()

                +" = $"+ (item1.getPrice()*item1.getQuantity()));

        // Print the details of the item2.

        System.out.println(item2.getName() + " "

                +item2.getQuantity() +" @ $" + item2.getPrice()

                +" = $"+ (item2.getPrice()*item2.getQuantity()));

        // Calculate the total cost of the two items and

        // print the total cost of the two items.

        System.out.println("\nTotal: $" +

                (item1.getPrice()* item1.getQuantity()+

                        item2.getPrice() *item2.getQuantity()));

    }

}