public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double toReturn = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());

        return toReturn;
    }

    public void printAnalysis() {
       System.out.println("Product: " + super.getName());
       System.out.println("History: " + this.history());
       System.out.println("Largest amount of product: " + this.history.maxValue());
       System.out.println("Smallest amount of product: " + this.history.minValue());
       System.out.println("Average: " + this.history.average());
    }

}
