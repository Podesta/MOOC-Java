import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (String input != {""}) {
            input = scan.nextLine();
            String pieces[] = input.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }

}

