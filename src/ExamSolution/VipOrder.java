package ExamSolution;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class VipOrder extends Order {
;


        private Double totalPrice;

        public VipOrder(int id, String name, String deliveryAddress, ArrayList<Item> itemList, Customer customer, PaymentType paymentType, LocalDateTime orderDate) throws Exception {
            super(id, name, deliveryAddress, itemList, customer, paymentType, orderDate);
            this.totalPrice = this.calculateTotalPrice();
        }

        public Double getTotalPrice() {
            return totalPrice;
        }

        public Double calculateTotalPrice() throws Exception {
            if(this.getCustomer().getCustomerType() != CustomerType.VIP){
                throw new Exception("The Order is VIP order but the customer is not VIP customer");
            }

            Double totalPrice = 0D;
            for(Item item : this.getItemList()){
                totalPrice += item.getPrice();
            }
            totalPrice = totalPrice - this.getCustomer().getCustomerDiscount();
            return totalPrice;
        }
    }


