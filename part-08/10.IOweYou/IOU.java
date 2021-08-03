import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debtList;

    public IOU() {
        this.debtList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debtList.getOrDefault(toWhom, 0);
    }

}
