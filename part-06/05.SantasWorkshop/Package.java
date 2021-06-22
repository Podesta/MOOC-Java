import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giftsInside;

    public Package() {
        this.giftsInside = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.giftsInside.add(gift);
    }

    public int totalWeight() {
        int giftsWeight = 0;
        for (Gift gift : giftsInside) {
            giftsWeight += gift.getWeight();
        }
        return giftsWeight;
    }

}
