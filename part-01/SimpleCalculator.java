import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.nextLine());

        int sum = n1 + n2;
        int diff = n1 - n2;
        int mult = n1 * n2;
        double div = (double)n1 / n2;
        
        System.out.println(n1 + " + " + n2 + " = " + sum);
        System.out.println(n1 + " - " + n2 + " = " + diff);
        System.out.println(n1 + " * " + n2 + " = " + mult);
        System.out.println(n1 + " / " + n2 + " = " + div);
    }
}
