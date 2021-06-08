import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First number? ");
        int orig = Integer.valueOf(scan.nextLine());
        System.out.print("Last number? ");
        int dest = Integer.valueOf(scan.nextLine());

        int result = 0;
        for (int i = orig; i <= dest; ++i) {
            result += i;
        }

        System.out.println("The sum is " + result);
    }
}
