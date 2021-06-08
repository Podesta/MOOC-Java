import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        for (int i = 0; i <= input; ++i) {
            System.out.println(i);
        }
    }
}
