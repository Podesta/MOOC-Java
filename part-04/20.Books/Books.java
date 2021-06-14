public class Books {

    private String title;
    private int pages;
    private int year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

    public String getTitle() {
        return this.title;
    }

}
