import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());

        this.storageUnit.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        return this.storageUnit.getOrDefault(unit, new ArrayList<>());
    }

    public void remove(String unit, String item) {
        // If the unit does't exist, do nothing
        if (!this.storageUnit.containsKey(unit)) {
            return;
        }

        // If the unit does not have the item, do nothing
        if (!this.storageUnit.get(unit).contains(item)) {
            return;
        }

        // Remove item
        this.storageUnit.get(unit).remove(item);

        // If unit is empty after removing the item, remove the unit
        if (this.storageUnit.get(unit).isEmpty()) {
            this.storageUnit.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> allUnits = new ArrayList<>();
        for (String unit : this.storageUnit.keySet()) {
            allUnits.add(unit);
        }

        return allUnits;
    }

}
