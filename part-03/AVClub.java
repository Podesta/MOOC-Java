import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        do { 
            input = scan.nextLine();

            String[] parts = input.split(" ");
            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        } while (!input.equals(""));
    }

}

