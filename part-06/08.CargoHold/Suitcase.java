import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int curWeight;

    public Suitcase (int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.curWeight = 0;
    }

    public void addItem(Item item) {
        if (this.curWeight + item.getWeight() > this.maxWeight) {
            return;
        }

        this.curWeight += item.getWeight();
        this.items.add(item);
    }

    public int totalWeight() {
        return this.curWeight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item toReturn = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > toReturn.getWeight()) {
                toReturn = item;
            }
        }
        return toReturn;
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }

        return this.items.size() + ((this.items.size() == 1) ? " item (" : " items (") +
                this.curWeight + " kg)";
    }

}
