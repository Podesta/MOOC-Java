import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> objects;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.objects = new ArrayList<>();
    }

    public void add(Packable object) {
        if (this.weight() + object.weight() > this.maxCapacity) {
            return;
        }
        this.objects.add(object);
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable object : objects) {
            weight += object.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.objects.size() + " items, total weight " + this.weight() + " kg";
    }

}
