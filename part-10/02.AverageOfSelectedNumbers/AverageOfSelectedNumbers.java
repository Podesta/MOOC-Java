import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            inputs.add(line);
            line = scanner.nextLine();
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        line = scanner.nextLine();
        double average = 0;

        switch (line) {
        case "n":
            average = inputs.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
            break;
        case "p":
            average = inputs.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
            System.out.println("Averga of the positive numbers: " + average);
            break;
        }
    }

}
