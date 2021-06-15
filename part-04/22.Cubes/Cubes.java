import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }

            int value = Integer.valueOf(input);
            System.out.println(value * value * value);
        }
    }

}
