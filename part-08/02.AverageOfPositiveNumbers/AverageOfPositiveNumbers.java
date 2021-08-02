import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;
        int input = Integer.valueOf(scan.nextLine());
        while (input != 0) {
            if (input > 0) {
                ++numbers;
                sum += input;
            }

            input = Integer.valueOf(scan.nextLine());
        }

        if (numbers == 0) {
            System.out.println("Cannot calculte the average");
        } else {
            System.out.println((double)sum / numbers);
        }
    }

}
