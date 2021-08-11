import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        UserInterface ui = new UserInterface(scanner, books);

        ui.getBooks();

        // Sorting as stream and preserving list
        System.out.println("\n" + books.size() + " books in total.");
        System.out.println("\nBooks:");
        books.stream()
            .sorted()
            .forEach(book -> System.out.println(book));

        // Sorting the list itself
        Collections.sort(books);
        ui.printBooks();
    }

}
