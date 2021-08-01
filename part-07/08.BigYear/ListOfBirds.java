import java.util.ArrayList;
import java.util.Scanner;

public class ListOfBirds {

    private ArrayList<Bird> birdsList;
    private Scanner scan;

    public ListOfBirds(Scanner scan) {
        this.birdsList = new ArrayList<>();
        this.scan = scan;
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latin = scan.nextLine();

        this.birdsList.add(new Bird(name, latin));
    }

    public void observation() {
        System.out.print("Bird? ");
        String name = scan.nextLine();

        for (Bird bird : this.birdsList) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }

        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : this.birdsList) {
            System.out.println(bird);
        }
    }

    public void printOne() {
        System.out.print("Bird? ");
        String name = scan.nextLine();

        for (Bird bird : this.birdsList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }

}
