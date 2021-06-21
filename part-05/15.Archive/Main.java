import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scan.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive archive = new Archive(identifier, name);

            if (!archives.contains(archive)) {
                archives.add(archive);
            }
        }

        for (Archive archive : archives) {
            System.out.println(archive);
        }
    }

}
