public class ItemToPurchase {
    //private data members

    private String itemDescription;
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    //default constructor
    public ItemToPurchase()
    {
        itemDescription="none";
        itemName="none";

    }

    //mutator for description
    public void setDescription(String description)
    {
        itemDescription=description;
    }

    //accessor for item description
    public String getDescription()
    {
        return itemDescription;
    }

    //prints the itemname followed by quantity price and total
    public void printItemCost()
    {
        System.out.println(itemName+" "+itemQuantity+" @ $"+itemPrice+" = $"+(itemPrice*itemQuantity));;
    }

    //printf item name followed by its description
    public void printItemDescription()
    {
        System.out.println(itemName+": "+itemDescription+"\n");
    }


    public String getName()
    {
        return itemName;
    }

    public void setPrice (double price)
    {
        itemPrice= (int) price;
    }

    public void setQuantity(int quantity)
    {
        itemQuantity=quantity;
    }

    public int getQuantity()
    {
        return itemQuantity;
    }
    public double getPrice()
    {
        return itemPrice;
    }

    public void setName(String name)
    {
        itemName=name;
    }
}