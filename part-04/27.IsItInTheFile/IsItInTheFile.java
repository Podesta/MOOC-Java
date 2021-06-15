import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scan.nextLine();
        System.out.println("Search for:");
        String search = scan.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while(scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                if (line.equals(search)) {
                    System.out.println("Found!");
                    return;
                }
            }
            System.out.println("Not found.");
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }

}
