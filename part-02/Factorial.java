import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a numbner: ");
        int input = Integer.valueOf(scan.nextLine());
        int factorial = 1;
        for (int i = 1; i <= input; ++i) {
            factorial *= i;
        }
        System.out.print("Factorial: " + factorial);
    }
}
