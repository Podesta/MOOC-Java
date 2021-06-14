import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scan.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scan.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scan.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}

