import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int curWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.curWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.curWeight + suitcase.totalWeight() > this.maxWeight) {
            return;
        }

        this.curWeight += suitcase.totalWeight();
        this.suitcases.add(suitcase);
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.curWeight + " kg)";
    }

}
