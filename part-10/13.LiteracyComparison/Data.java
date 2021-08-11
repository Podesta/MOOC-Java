public class Data {

    private String country;
    private String gender;
    private int year;
    private double literacy;

    public Data(String country, String gender, String year, String literacy) {
        this.country = country.trim();
        this.gender = this.formatGender(gender.trim());
        this.year = Integer.valueOf(year.trim());
        this.literacy = Double.valueOf(literacy.trim());
    }

    private String formatGender(String input) {
        String[] parts = input.split(" ");
        return parts[0];
    }

    public String getCountry() {
        return this.country;
    }

    public String getGender() {
        return this.gender;
    }

    public int getYear() {
        return this.year;
    }

    public double getLiteracy() {
        return this.literacy;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacy;
    }

}
