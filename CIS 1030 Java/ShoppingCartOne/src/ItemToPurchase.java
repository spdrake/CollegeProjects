//Definition of the ItemToPurchase.

 class ItemToPurchase {

    // Define the variables.

    // Private fields.

    private String itemName;

    private int itemPrice;

    private int itemQuantity;

    // Definition of the method ItemToPurchase().

    // Default Constructor.

    public ItemToPurchase(){

        this.itemName="none";

        this.itemPrice=0;

        this.itemQuantity=0;

    }

    // Definition of the method setName().

    // Mutator method.

    public void setName(String itemName){

        this.itemName=itemName;

    }

    // Definition of the method getName().

    // Accessor method.

    public String getName(){

        return this.itemName;

    }

    // Definition of the method setPrice().

    // Mutator method.

    public void setPrice(int itemPrice){

        this.itemPrice=itemPrice;

    }

    // Definition of the method getName().

    // Accessor method.

    public int getPrice(){

        return this.itemPrice;

    }

    // Definition of the method setQuality().

    // Mutator method.

    public void setQuantity(int itemQuantity){

        this.itemQuantity=itemQuantity;

    }

    // Definition of the method getQuality().

    // Accessor method.

    public int getQuantity(){

        return this.itemQuantity;

    }

}