import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        int n2 = Integer.valueOf(scan.nextLine());
        int sum = n1 + n2;
        double sqrt = Math.sqrt(sum);
        System.out.println(sqrt);
    }
}
