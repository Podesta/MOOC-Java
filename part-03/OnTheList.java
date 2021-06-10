import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        String search = scan.nextLine();
        if (list.contains(search)) {
            System.out.println(search + " was found!");
        }
        else {
            System.out.println(search + " was not found!");
        }
    }
}
