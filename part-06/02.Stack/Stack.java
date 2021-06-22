import java.util.ArrayList;

public class Stack {

    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void add(String value) {
        if (!this.items.contains(value)) {
            this.items.add(value);
        }
    }

    public boolean isEmpty() {
        if (this.items.size() == 0) {
            return true;
        }
        return false;
    }

    public ArrayList<String> values() {
        return this.items;
    }

    public String take() {
        int last = this.items.size() - 1;
        return this.items.remove(last);
    }

}
