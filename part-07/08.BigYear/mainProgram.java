import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        ListOfBirds birds = new ListOfBirds(scan);

        System.out.print("? ");
        String command = scan.nextLine();
        while (!command.equals("Quit")) {
            switch (command) {
            case "Add":
                birds.addBird();
                break;
            case "Observation":
                birds.observation();
                break;
            case "All":
                birds.printAll();
                break;
            case "One":
                birds.printOne();
                break;
            }

            System.out.print("? ");
            command = scan.nextLine();
        }
    }

}
