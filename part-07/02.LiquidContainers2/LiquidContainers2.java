import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String operation = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (operation.equals("add")) {
                first.add(amount);
            } else if (operation.equals("remove"))  {
                second.remove(amount);
            } else if (operation.equals("move")) {
                if (first.contains() < amount) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            }
        }
    }
}

