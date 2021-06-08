import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Where to? ");
        int dest = Integer.valueOf(scan.nextLine());
        System.out.print("Where from? ");
        int orig = Integer.valueOf(scan.nextLine());
        for (int i = orig; i <= dest; ++i) {
            System.out.println(i);
        }
    }
}

