import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> bookOfRecipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> bookOfRecipes) {
        this.scanner = scanner;
        this.bookOfRecipes = bookOfRecipes;
    }

    public String printFileToReadMenu() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");
        return fileName;
    }

    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    public void readCommands() {
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            switch(command) {
                case "list":
                    this.printRecipes();
                    break;
                case "stop":
                    return;
                case "find name":
                    this.findName();
                    break;
                case "find cooking time":
                    this.findCookingTime();
                    break;
                case "find ingredient":
                    this.findIngredient();
                    break;
            }
        }
    }

    public void printRecipes() {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : bookOfRecipes) {
            System.out.println(recipe);
        }
        System.out.println("");
    }

    public void findName() {
        System.out.print("Searched word: ");
        String search = scanner.nextLine();
        System.out.println("");

        System.out.println("Recipes:");
        for (Recipe recipe : bookOfRecipes) {
            if (recipe.getName().contains(search)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void findCookingTime() {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(scanner.nextLine());
        System.out.println("");

        System.out.println("Recipes:");
        for (Recipe recipe : bookOfRecipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void findIngredient() {
        System.out.print("Searched word: ");
        String search = scanner.nextLine();
        System.out.println("");

        System.out.println("Recipes:");
        for (Recipe recipe : bookOfRecipes) {
            for (int i = 0; i < recipe.getIngredients().size(); ++i) {
                if (recipe.getIngredients().get(i).equals(search)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
        System.out.println("");
    }

}
