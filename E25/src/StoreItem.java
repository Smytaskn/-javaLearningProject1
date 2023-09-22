public class StoreItem {
    private String name;
    private double price;
    private int quality;

    public StoreItem(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Quality: " + quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
}
