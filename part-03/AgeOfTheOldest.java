import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dataset = scan.nextLine();
        int oldest = 0;
        do {
            String[] pieces = dataset.split(",");
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
            }
            
            dataset = scan.nextLine();
        } while (!dataset.equals(""));
        System.out.println("Age of the oldest: " + oldest);
    }

}
