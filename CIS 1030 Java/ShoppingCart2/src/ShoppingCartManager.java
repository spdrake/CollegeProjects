import java.util.Scanner;

public class ShoppingCartManager {
    //display a menu and perform appropriate action
    public static void printMenu(ShoppingCart cart,Scanner scanner)
    {
        String choice;
        String name, descrip;
        double price;
        int quantity;
        ItemToPurchase item;

        while(true)
        {
            System.out.print("MENU\n");
            System.out.print("a - Add item to cart\n");
            System.out.print("d - Remove item from cart\n");
            System.out.print("c - Change item quantity\n");
            System.out.print("i - Output items' descriptions\n");
            System.out.print("o - Output shopping cart\n");
            System.out.println("q - Quit");


            System.out.println("Choose an option: ");
            choice=scanner.next().trim();
            if(choice.length()==1)
            {
                switch(choice.toLowerCase().charAt(0))
                {
                    case 'a':
                        scanner.nextLine();//remove newline character from keyboard
                        System.out.print("ADD ITEM TO CART\n");
                        System.out.print("Enter the item name:\n");
                        name=scanner.nextLine();
                        System.out.print("Enter the item description:\n");
                        descrip=scanner.nextLine();
                        System.out.print("Enter the item price:\n");
                        price=scanner.nextInt();
                        System.out.print("Enter the item quantity:\n");
                        quantity=scanner.nextInt();

                        item=new ItemToPurchase();
                        item.setName(name);
                        item.setDescription(descrip);
                        item.setPrice(price);
                        item.setQuantity(quantity);

                        cart.addItem(item);
                        break;
                    case 'd':
                        scanner.nextLine();//remove newline character from keyboard
                        System.out.println("REMOVE ITEM FROM CART");
                        System.out.println("Enter name of item to remove:");
                        name=scanner.nextLine();
                        cart.removeItem(name);
                        break;

                    case 'c':
                        scanner.nextLine();//remove newline character from keyboard
                        System.out.println("CHANGE ITEM QUANTITY");
                        System.out.println("Enter the item name:");
                        name=scanner.nextLine();
                        item=new ItemToPurchase();
                        item.setName(name);
                        System.out.println("Enter the new quantity:");
                        quantity=scanner.nextInt();
                        cart.modifyItem(item,"none",0,quantity);
                        break;

                    case 'i':
                        System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                        cart.printDescriptions();
                        break;

                    case 'o':
                        System.out.println("OUTPUT SHOPPING CART");
                        cart.printTotal();
                        break;


                    case 'q': return;


                }
            }
        }

    }
    public static void main(String[] args) {
        String custname,curdate;
        Scanner scanner=new Scanner(System.in);
        ShoppingCart cart;

        //get user's intpu for name and date
        System.out.println("Enter Customer's Name:");
        custname=scanner.nextLine();
        System.out.println("Enter Today's Date:");
        curdate=scanner.nextLine();
        System.out.println("");


        System.out.println("Customer Name: "+custname);
        System.out.println("Today's Date: "+curdate);
        System.out.println("");
        cart=new ShoppingCart(custname,curdate);

        printMenu(cart, scanner);

        scanner.close();
    }
}