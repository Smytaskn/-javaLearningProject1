import java.util.List;

public class ShoppingCart<T extends StoreItem>  {

    private List<T> items;

    //add item
    public void addItem(T item){
        items.add(item);
    }
//remove item
public List<T> getItems(T object) {
    return items;
}


    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (T item : items) {
            totalPrice = totalPrice + item.getPrice();
        }
        return totalPrice;
    }






}
