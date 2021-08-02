import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        String input = scan.nextLine();
        while (!input.equals("end")) {
            number = Integer.valueOf(input);
            number *= number * number;

            System.out.println(number);
            input = scan.nextLine();
        }
    }

}
