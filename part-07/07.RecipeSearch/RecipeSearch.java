import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> bookOfRecipes = new ArrayList<>();
        UserInterface ui = new UserInterface(scanner, bookOfRecipes);

        String fileName = ui.printFileToReadMenu();
        ReadFile.read(fileName, bookOfRecipes);

        ui.printCommands();
        ui.readCommands();
    }

}
