import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());

            if (input == 0) {
                break;
            } else if (input < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (input > 0) {
                System.out.println(input * input);
            }
        }
    }
}
