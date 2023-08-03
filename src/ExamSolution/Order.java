package ExamSolution;


import java.time.LocalDateTime;
import java.util.ArrayList;

    public abstract class Order implements Priceable {
        private int id;
        private String name;
        private String deliveryAddress;
        private ArrayList<Item> itemList;
        private Customer customer;
        private PaymentType paymentType;
        private LocalDateTime orderDate;

        public Order(int id, String name, String deliveryAddress, ArrayList<Item> itemList, Customer customer, PaymentType paymentType, LocalDateTime orderDate) {
            this.id = id;
            this.name = name;
            this.deliveryAddress = deliveryAddress;
            this.itemList = itemList;
            this.customer = customer;
            this.paymentType = paymentType;
            this.orderDate = orderDate;
            handleCustomerFavoriteItems();
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public ArrayList<Item> getItemList() {
            return itemList;
        }

        public Customer getCustomer() {
            return customer;
        }

        public PaymentType getPaymentType() {
            return paymentType;
        }

        public LocalDateTime getOrderDate() {
            return orderDate;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public void setItemList(ArrayList<Item> itemList) {
            this.itemList = itemList;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public void setPaymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
        }

        public void setOrderDate(LocalDateTime orderDate) {
            this.orderDate = orderDate;
        }
        private void handleCustomerFavoriteItems(){
            boolean shouldAdd = true;
            for(Item orderItem : this.getItemList()){
                for(Item customerFavoriteItem : this.getCustomer().getFavoriteItems()) {
                    if(customerFavoriteItem.getName() != orderItem.getName()){
                        continue;
                    } else {
                        shouldAdd = false;
                    }
                }
                if(shouldAdd){
                    this.getCustomer().getFavoriteItems().add(orderItem);
                }
                shouldAdd = true;
            }
        }
    }
}
