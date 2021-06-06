import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average = 0;
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());

            if (input == 0) {
                break;
            }

            ++count;
            sum += input;
        }

        average = (double)sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}
