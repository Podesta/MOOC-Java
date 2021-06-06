import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average;

        while (true) {
            int input = Integer.valueOf(scan.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                ++count;
                sum +=input;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double)sum / count;
            System.out.println(average);
        }
    }
}
