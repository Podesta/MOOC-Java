import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double maxValue = Double.MIN_VALUE;
        
        if (this.history.isEmpty()) {
            return 0;
        }

        for (double tmp : this.history) {
            if (tmp > maxValue) {
                maxValue = tmp;
            }
        }
        return maxValue;
    }

    public double minValue() {
        double minValue = Double.MAX_VALUE;

        if (this.history.isEmpty()) {
            return 0;
        }

        for (double tmp : this.history) {
            if (tmp < minValue) {
                minValue = tmp;
            }
        }

        return minValue;
    }

    public double average() {
        double average = 0;
        int units = this.history.size();

        if (this.history.isEmpty()) {
            return 0;
        }

        for (double tmp : this.history) {
            average += tmp;
        }

        average /= units;
        return average;
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

}
