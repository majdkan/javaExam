public class item {
    public long getId() {
        return id;
    }

  public String getItemName() {
        return itemName;
    }

   public double getItemPrice() {
        return itemPrice;
    }

    public item(long id, String itemName, double itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    long id ;
    String itemName;
   float itemPrice;



}
