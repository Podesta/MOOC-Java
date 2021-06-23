import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scan;

    public UserInterface(JokeManager jokeManager, Scanner scan) {
        this.jokeManager = jokeManager;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            this.printMenu();
            String choice = scan.nextLine();

            switch(choice) {
            case "1":
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                this.jokeManager.addJoke(joke);
                break;
            case "2":
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());
                break;
            case "3":
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
                break;
            case "X":
                return;
            }
        }
    }

    public void printMenu() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

}
