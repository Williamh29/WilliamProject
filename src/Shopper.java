public class Shopper {
    private String name;
    private String selectedItem;
    private double itemPrice;

    public Shopper(String name) {
        this.name = name;
        selectedItem = "";
        itemPrice = 0.0;
    }
    public Shopper() {
        name = "Anonymous";
        selectedItem = "";
        itemPrice = 0.0;
    }

    public String getName() {

        return name;
    }

    public String getSelectedItem() {

        return selectedItem;
    }

    public void setSelectedItem(String value) {

        selectedItem = value;
    }

    // getter and setter method for the price


}