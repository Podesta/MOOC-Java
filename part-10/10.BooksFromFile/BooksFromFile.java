import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filenae: ");
        String file = scanner.nextLine();
        List<Book> books = BooksFromFile.readBooks(file);

        books.stream()
            .map(book -> book.getName() + " - " + book.getAuthor())
            .forEach(s -> System.out.println(s));
    }

    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                .map(line -> line.split(","))
                .filter(parts -> parts.length == 4) // Make sure all fields are present
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new ArrayList<>();
    }

}
