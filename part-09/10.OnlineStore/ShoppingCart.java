import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Item> buyingList;

    public ShoppingCart() {
        this.buyingList = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item toAdd = new Item(product, 1, price);

        if (this.buyingList.contains(toAdd)) {
            for (Item item : this.buyingList) {
                if (item.equals(toAdd)) {
                    item.increaseQuantity();
                }
            }
        } else {
            this.buyingList.add(toAdd);
        }
    }

    public int price() {
        int total = 0;
        for (Item item : buyingList) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : buyingList) {
            System.out.println(item);
        }
    }

}
