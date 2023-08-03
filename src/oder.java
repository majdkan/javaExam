import java.util.Date;
import java.util.List;

public class oder {
    long id;
    boolean vip;



    String name;
    String dileveryADress;
    List<String>itemsOfTheOrder;
    costumer orderCostumer;
    float orderTotalPrice;
    String paymentMethod;
    Date orderDate;

     public void calculateOrderPrice{


    }
    public oder(long id,boolean vip; String name, String dileveryADress, List<String> itemsOfTheOrder, costumer orderCostumer, double orderTotalPrice, String paymentMethod, Date orderDate) {
        this.id = id;
        this vip= vip;

        this.name = name;
        this.dileveryADress = dileveryADress;
        this.itemsOfTheOrder = itemsOfTheOrder;
        this.orderCostumer = orderCostumer;
        this.orderTotalPrice = orderTotalPrice;
        this.paymentMethod = paymentMethod;
        this.orderDate = orderDate;


    }

    public boolean isVip() {
        return vip;
        else throw
    }
}
