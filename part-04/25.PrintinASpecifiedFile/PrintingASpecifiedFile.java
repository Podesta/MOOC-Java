import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scan.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {

            while (scan.hasNextLine() {
                String line = scan.nextLine();
                System.out.println(line);
            }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
    }

}
