import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        int size = this.elements.size();
        String all = new String();
        for (String element : elements) {
            all += "\n" + element;
        }

        return "The collection " + this.name + " has " + size +
            ((size == 1) ? " element:" : " elements:") + all;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
}
