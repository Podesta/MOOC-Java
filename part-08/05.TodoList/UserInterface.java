import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            switch (command) {
            case "stop":
                return;
            case "add":
                System.out.print("To add: ");
                String task = scan.nextLine();
                this.todoList.add(task);
                break;
            case "remove":
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scan.nextLine());
                this.todoList.remove(index);
                break;
            case "list":
                this.todoList.print();
                break;
            }
        }
    }

}
