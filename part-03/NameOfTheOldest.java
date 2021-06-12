import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dataset = scan.nextLine();
        int oldest = 0;
        String oldestName = "Forced initialization";

        do {
            String[] pieces = dataset.split(",");
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                oldestName = pieces[0];
            }
            
            dataset = scan.nextLine();
        } while (!dataset.equals(""));
        System.out.println("Name of the oldest: " + oldestName);
    }

}
