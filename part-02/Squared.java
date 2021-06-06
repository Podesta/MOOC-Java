import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        int squared = n1 * n1;
        System.out.println(squared);
    }
}
