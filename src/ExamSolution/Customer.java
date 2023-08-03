package ExamSolution;
import java.util.ArrayList;
public class Customer {



        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String deliveryAddress;
        private CustomerType customerType;
        private Double customerDiscount;
        private ArrayList<Item> favoriteItems;
        private Giftable customerGift;


        public  Customer(int id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, Double customerDiscount, ArrayList<Item> favoriteItems) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.deliveryAddress = deliveryAddress;
            this.customerType = customerType;
            this.customerDiscount = customerDiscount;
            this.favoriteItems = favoriteItems;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public CustomerType getCustomerType() {
            return customerType;
        }

        public Double getCustomerDiscount() {
            return customerDiscount;
        }

        public ArrayList<Item> getFavoriteItems() {
            return favoriteItems;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public void setCustomerType(CustomerType customerType) {
            this.customerType = customerType;
        }

        public void setCustomerDiscount(Double customerDiscount) {
            this.customerDiscount = customerDiscount;
        }

        public void setFavoriteItems(ArrayList<Item> favoriteItems) {
            this.favoriteItems = favoriteItems;
        }

        public void openGift(){
            this.customerGift.openGift();
        }

        public void takeGift(Giftable gift){
            this.customerGift = gift;
        }
    }

