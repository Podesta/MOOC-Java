import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        UserInterface ui = new UserInterface(scanner, books);

        ui.getBooks();
        ui.printBooks();
        System.out.println("---");

        Comparator<Book> comparator = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getName);

        Collections.sort(books, comparator);
        ui.printBooks();
    }

}
