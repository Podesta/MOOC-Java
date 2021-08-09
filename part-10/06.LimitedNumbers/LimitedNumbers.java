import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        Integer input = Integer.valueOf(scanner.nextLine());
        while (input >= 0) {
            list.add(input);
            input = Integer.valueOf(scanner.nextLine());
        }

        list.stream()
            .filter(number -> number > 0 && number <= 5)
            .forEach(s -> System.out.println(s));
    }

}
