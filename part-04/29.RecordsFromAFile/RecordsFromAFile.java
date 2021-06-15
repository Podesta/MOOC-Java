import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] fields = line.split(",");
                String name = fields[0];
                int age = Integer.valueOf(fields[1]);

                if (age != 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
