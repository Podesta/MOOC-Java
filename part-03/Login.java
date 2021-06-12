import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enger a username: ");
        String user = scan.nextLine();
        System.out.print("Enger a password: ");
        String pass = scan.nextLine();

        if ((user.equals("alex") && pass.equals("sunshine")) ||
            (user.equals("emma") && pass.equals("haskell"))) {

            System.out.println("You have successfully logged in!");

        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

