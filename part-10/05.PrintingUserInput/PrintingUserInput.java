import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allInput = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            allInput.add(line);
            line = scanner.nextLine();
        }
        
        allInput.stream().forEach(string -> System.out.println(string));
    }

}
