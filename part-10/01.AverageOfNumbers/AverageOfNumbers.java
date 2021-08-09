import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            inputs.add(line);
            line = scanner.nextLine();
        }

        double average = inputs.stream()
            .mapToInt(number -> Integer.valueOf(number))
            .average()
            .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }

}
