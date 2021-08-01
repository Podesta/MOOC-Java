import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "-42\n" + "24\n" + "42\n" + "72\n" +
                       "80\n" + "52\n" + "-1\n";
        
        String input2 = "49\n" + "48\n" + "47\n" + "-1\n";
        
        Scanner scanner = new Scanner(System.in);
        Scores scores = new Scores();
        
        UserInterface ui = new UserInterface(scanner, scores);
        
        ui.start();      
    }
}
