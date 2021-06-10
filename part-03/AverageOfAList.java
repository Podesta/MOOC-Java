import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int size = 0;
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }

            numbers.add(input);
            ++size;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double)sum / size;
        System.out.print("Average: " + average);
    }
}
