public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.quantity * this.unitPrice;
    }

    public void increaseQuantity() {
        ++this.quantity;
    }

    @Override
    public int hashCode() {
        return this.product.hashCode() + this.unitPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Item compareItem = (Item)obj;

        if (this.product.equals(compareItem.product) &&
            this.unitPrice == compareItem.unitPrice) {
            return true;
            }

        return false;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }

}
