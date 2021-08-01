import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public final class ReadFile {

    public ReadFile() {
        throw new Error("ERROR: ReadFile class can not be constructed!");
    }

    public static void read(String fileName, ArrayList<Recipe> bookOfRecipes) {

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            int recipeIndex = 0;

            while (fileScan.hasNextLine()) {
                // Populate each individual Recipe inside the Book.
                String name = fileScan.nextLine();
                int cookingTime = Integer.valueOf(fileScan.nextLine());

                bookOfRecipes.add(new Recipe(name, cookingTime));

                // Add the ingredients. If line is empty, this recipe is finished.
                String line = fileScan.nextLine();
                while (!line.isEmpty()) {
                    bookOfRecipes.get(recipeIndex).addIngredient(line);
                    if (!fileScan.hasNextLine()) {
                        break;
                    }
                    line = fileScan.nextLine();
                }

                // Reached when line is empty. Get ready for next Recipe.
                ++recipeIndex;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
    }

}
