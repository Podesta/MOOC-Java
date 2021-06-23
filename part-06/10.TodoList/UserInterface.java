import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scan.nextLine();

            if (cmd.equals("stop")) {
                break;
            }

            this.selectCmd(cmd);
        }
    }

    public void selectCmd(String cmd) {
        if (cmd.equals("add")) {
            this.add();
        } else if (cmd.equals("list")) {
            this.list();
        } else if (cmd.equals("remove")) {
            this.remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        String toAdd = scan.nextLine();
        this.list.add(toAdd);
    }

    public void list() {
        this.list.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(scan.nextLine());
        this.list.remove(toRemove);
    }

}
