import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input;
        do {
            input = scan.nextLine();

            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
        } while (!input.equals(""));
    }

}
