import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

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
        int size = list.size();
        System.out.println("Int total: " + size);
    }
}
