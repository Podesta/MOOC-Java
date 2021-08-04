import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> carOwner;

    public VehicleRegistry() {
        this.carOwner = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.carOwner.containsKey(licensePlate)) {
            return false;
        }

        this.carOwner.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.carOwner.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.carOwner.containsKey(licensePlate)) {
            this.carOwner.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate toPrint : this.carOwner.keySet()) {
            System.out.println(toPrint);
        }
    }

    public void printOwners() {
        ArrayList<String> alreadyPrinted = new ArrayList<>();

        for (String toPrint : this.carOwner.values()) {
            if (!alreadyPrinted.contains(toPrint)) {
                alreadyPrinted.add(toPrint);
                System.out.println(toPrint);
            }

        }
    }

}
