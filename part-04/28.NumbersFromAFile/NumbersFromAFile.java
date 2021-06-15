import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File? ");
        String file = scan.nextLine();
        System.out.print("Lower bound? ");
        int lower = Integer.valueOf(scan.nextLine());
        System.out.print("Upper bound? ");
        int upper = Integer.valueOf(scan.nextLine());

        int count = 0;
        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {
                int num = Integer.valueOf(scanFile.nextLine());
                if (num >= lower && num <= upper) {
                    ++count;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.print("Numbers: " + count);
    }

}
