import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }

            ++count;
        }
        System.out.println(count);
    }

}
