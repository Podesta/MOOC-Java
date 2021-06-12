import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input;
        do {
            input = scan.nextLine();

            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        } while (!input.equals(""));
    }

}
