import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give numbers:");

        int input;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        double average;

        while (true) {
            input = Integer.valueOf(scan.nextLine());

            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                ++even;
            } else if (input % 2 != 0) {
                ++odd;
            }

            sum += input;
            ++count;
        }

        average = (double)sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
