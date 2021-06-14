import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());

            books.add(new Books(title, pages, year));
        }

        System.out.println();
        System.out.print("What information to be printed? ");
        String print = scan.nextLine();

        for (Books book : books) {
            if (print.equals("everything")) {
                System.out.println(book);
            } else if (print.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }

}

