import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        if (n1 == 1984) {
            System.out.println("Orwell");
        }
    }
}
