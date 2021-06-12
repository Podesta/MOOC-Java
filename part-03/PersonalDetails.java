import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String longestName = "Forced initialization";
        int longest = 0;
        int sum     = 0;
        int count   = 0;
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");

            ++count;
            sum += Integer.valueOf(pieces[1]);
            if (pieces[0].length() > longest) {
                longest = pieces[0].length();
                longestName = pieces[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }

}
