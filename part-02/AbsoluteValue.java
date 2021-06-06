import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());

        if (n1 < 0) {
            n1 = n1 * -1;
            System.out.println(n1);
        } else {
            System.out.println(n1);
        }
    }
}
