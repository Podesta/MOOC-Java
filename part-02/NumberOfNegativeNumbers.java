import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scan.nextLine());
            
            if (n1 == 0) {
                break;
            }

            if (n1 < 0) {
                ++counter;
            }
        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
