import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scan.nextLine();

            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            this.selectCmd(cmd);
        }
    }

    public void selectCmd(String cmd) {
        if (cmd.equals("add")) {
            this.add();
        } else if (cmd.equals("search")) {
            this.search();
        } else {
            System.out.println("Unkown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scan.nextLine();
        System.out.print("Translation: ");
        String translation = scan.nextLine();

        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String toTranslate = scan.nextLine();
        String translation = this.dictionary.translate(toTranslate);

        if (translation == null) {
            System.out.println("Word " + toTranslate + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }

}
