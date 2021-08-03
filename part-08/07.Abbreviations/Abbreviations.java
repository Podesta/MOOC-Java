import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> dictionary;

    public Abbreviations() {
        this.dictionary = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.dictionary.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.dictionary.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.dictionary.get(abbreviation);
    }

}
