import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker regexCheck = new Checker();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(regexCheck.isDayOfWeek(input));

        System.out.print("Enter a string: ");
        input = scanner.nextLine();
        System.out.println(regexCheck.allVowels(input));

        System.out.print("Enter a string: ");
        input = scanner.nextLine();
        System.out.println(regexCheck.timeOfDay(input));

    }

}
