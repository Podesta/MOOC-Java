import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> index = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; ++i) {
            if (list.get(i) == search) {
                index.add(i);
            }
        }

        size = index.size();
        for (int i = 0; i < size; ++i) {
            System.out.println(search + " is at index " + index.get(i));
        }
    }
}

