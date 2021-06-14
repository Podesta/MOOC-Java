import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        System.out.print("Name: ");
        String name = scan.nextLine();
        while (!name.equals("")) {
            items.add(new Item(name));

            System.out.print("Name: ");
            name = scan.nextLine();
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }

}
