import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        System.out.println("");

        // Find the smallest number
        int size = list.size();
        int smallest = list.get(0);
        for (int i = 0; i < size; ++i) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        // Save index positions
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < size; ++i) {
            if (list.get(i) == smallest) {
                index.add(i);
            }
        }

        // Print results
        System.out.println("Smallest number: " + smallest);
        size = index.size();
        for (int i = 0; i < size; ++i) {
            System.out.println("Found at index: " + index.get(i));
        }

    }
}
