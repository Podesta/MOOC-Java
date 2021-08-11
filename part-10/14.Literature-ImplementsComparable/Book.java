public class Book implements Comparable<Book> {

    private String name;
    private int age;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.age = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }

    @Override
    public int compareTo(Book compareBook) {
        if (this.age == compareBook.age) {
            return this.name.compareTo(compareBook.name);
        }
        return this.age - compareBook.age;
    }

}
