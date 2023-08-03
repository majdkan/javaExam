import java.util.List;

public class costumer {
    long id;
    String firstName;
    String lastName;
    String email;
    String dileveryAdress;
    boolean costumerType;
    double discount;
    List<String> favoriteItems;
    String costumerGift;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDileveryAdress() {
        return dileveryAdress;
    }

    public void setDileveryAdress(String dileveryAdress) {
        this.dileveryAdress = dileveryAdress;
    }

    public boolean isCostumerType() {
        return costumerType;
    }

    public void setCostumerType(boolean costumerType) {
        this.costumerType = costumerType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<String> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(List<String> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public String getCostumerGift() {
        return costumerGift;
    }

    public void setCostumerGift(String costumerGift) {
        this.costumerGift = costumerGift;
    }

    public costumer(long id, String firstName, String lastName, String email, String dileveryAdress, boolean costumerType, double discount, List<String> favoriteItems, String costumerGift) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dileveryAdress = dileveryAdress;
        this.costumerType = costumerType;
        this.discount = discount;
        this.favoriteItems = favoriteItems;
        this.costumerGift = costumerGift;
    }
}
