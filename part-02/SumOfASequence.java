import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number? ");
        int input = Integer.valueOf(scan.nextLine());
        int result = 0;
        for (int i = 1; i <= input; ++i) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
