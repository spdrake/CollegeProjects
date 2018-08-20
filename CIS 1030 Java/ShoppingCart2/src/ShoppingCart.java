import java.util.ArrayList;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    //default constructor
    public ShoppingCart()
    {
        customerName="none";
        currentDate="January 1, 2016";
        cartItems=new ArrayList<ItemToPurchase>();
    }

    //parameterized constructor
    public ShoppingCart(String custName,String cdate)
    {
        customerName=custName;
        currentDate=cdate;
        cartItems=new ArrayList<ItemToPurchase>();
    }

    //accessor for customer name
    public String getCustomerName()
    {
        return customerName;
    }

    //accessor for date
    public String getDate()
    {
        return currentDate;
    }

    //add item to cartitems
    public void addItem(ItemToPurchase item)
    {
        cartItems.add(item);
    }

    //removes an item with given name from cart items if it exists. Displays a message if
    //item not found.
    public void removeItem(String itemname)
    {
        for(int i=0;i<cartItems.size();i++)
        {
            if(cartItems.get(i).getName().equals(itemname)) //if the item's name at current index is matching
            {
                cartItems.remove(i); //remove from list and return
                return;
            }
        }

        //if reached here, item not found
        System.out.println("Item not found in cart. Nothing removed.");
    }

    public void modifyItem(ItemToPurchase item,String description,double price,int quantity)
    {
        ItemToPurchase ci;
        for(int i=0;i<cartItems.size();i++)
        {
            if(cartItems.get(i).getName().equals(item.getName())) //if the item's name at current index is matching
            {

                ci=cartItems.get(i);

                if(!description.equals("none")) //not default value for description
                    ci.setDescription(description);

                if(price!=0) //not default value for price
                    ci.setPrice(price);
                if(quantity!=0) //not default value for quantity
                    ci.setQuantity(quantity);

                return;
            }
        }

        //if reached here, item not found
        System.out.println("Item not found in cart. Nothing modified.");
    }

    //returns the number of items in cart i.e. total of all quantities
    public int getNumItemsInCart()
    {
        int total=0;
        for(int i=0;i<cartItems.size();i++)
        {
            total+=cartItems.get(i).getQuantity();
        }
        return total;
    }
    //returns the total cost of all items
    public double getCostOfCart()
    {
        double total=0;
        for(int i=0;i<cartItems.size();i++)
        {
            total+=cartItems.get(i).getQuantity()*cartItems.get(i).getPrice();
        }
        return total;
    }

    //prints all the items in the cart and the total of the cart itemsprice
    public void printTotal()
    {
        if(cartItems.isEmpty())
        {
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else
        {
            System.out.println(customerName+"'s Shopping Cart - "+currentDate);
            System.out.println("Number of Items: "+getNumItemsInCart()+"\n");


            for(int i=0;i<cartItems.size();i++)
            {
                cartItems.get(i).printItemCost();
            }

            System.out.println("Total: $"+getCostOfCart());


        }
    }

    public void printDescriptions()
    {
        if(cartItems.isEmpty())
        {
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else
        {
            System.out.println(customerName+"'s Shopping Cart - "+currentDate+"\n");

            System.out.println("Item Descriptions");


            for(int i=0;i<cartItems.size();i++)
            {
                cartItems.get(i).printItemDescription();
            }
        }
    }
}