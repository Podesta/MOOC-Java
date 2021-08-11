import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Book> books;

    public UserInterface(Scanner scanner, ArrayList<Book> books) {
        this.scanner = scanner;
        this.books = books;
    }

    public void getBooks() {
        System.out.print("Input the name of the book, empty stops: ");
        String input = scanner.nextLine();

        while (!input.isEmpty()) {
            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            this.books.add(new Book(input, age));

            System.out.print("Input the name of the book, empty stops: ");
            input = scanner.nextLine();
        }
    }

    public void printBooks() {
        System.out.println("\n" + this.books.size() + " books in total.");
        System.out.println("\nBooks:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
