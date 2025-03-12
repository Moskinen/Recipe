import java.util.Scanner;
import java.util.ArrayList;

public class Methods {

    //Method to add new recipe and store it
    public static void addNewRecipe() {

        ArrayList<Recipe> recipeBook = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have chosen to add a new recipe");

        System.out.println("Is your recipe:\n APPETIZER \n MAIN \n DESSERT \n SNACK");
        typeOfRecipe type = typeOfRecipe.valueOf(scanner.nextLine());

        System.out.println("What is the title of your recipe?");
        String title = scanner.nextLine();

        System.out.println("How many people is the recipe for?");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What ingredients are used? Remember the quantity");
        String ingredients = scanner.nextLine();

        System.out.println("List the instructions for the recipe");
        String instructions = scanner.nextLine();

        Recipe newRecipe = new Recipe(type, title, numberOfPeople, ingredients, instructions);
        recipeBook.add(newRecipe);

        System.out.println("Your recipe \" " + title + "\" has been added to the website");
    }

    //Method to display menu
    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Add New Recipe");
        System.out.println("2. View All Recipes");
        System.out.println("3. Search Recipes");
        System.out.println("4. Edit Recipe");
        System.out.println("5. Delete Recipe");
        System.out.println("6. Exit");
    }

    //Method to view all recipes
    public static void searchAllRecipes() {

    }

    // metode for at søge efter opskrift
    public void findRecipe(String title, typeOfRecipe type, int numberOfPeople, String ingredients){
    }

    // metode som viser mulighederne fordelt i kategorier
    public static void displayRecipesByCategory(ArrayList<Recipe> recipes) {
        // Display all appetizers recipes
        System.out.println("Recipes for sweet appetizers:");
        for (Recipe recipe : recipes) {
            // Check if the recipe type is appetizer
            if (recipe.getTypeOfRecipe() == typeOfRecipe.APPETIZER) {
                // Print the recipe details
                System.out.println(recipe.toString());
            }
        }

        // Display all main course recipes
        System.out.println("Recipes for fulfilling main course:");
        for (Recipe recipe : recipes) {
            // Check if the recipe type is main
            if (recipe.getTypeOfRecipe() == typeOfRecipe.MAIN) {
                // Print the recipe details
                System.out.println(recipe.toString());
            }
        }

        // Display all dessert recipes
        System.out.println("Recipes for delicious desserts:");
        for (Recipe recipe : recipes) {
            // Check if the recipe type is dessert
            if (recipe.getTypeOfRecipe() == typeOfRecipe.DESSERT) {
                // Print the recipe details
                System.out.println(recipe.toString());
            }
        }
        // en metode der printer en indkøbsliste
        public static void printGroceryList(ArrayList < Recipe > recipes) {
            System.out.println("Grocery List:");
            for (Recipe recipe : recipes) {
                // Print the ingredients of each recipe
                System.out.println(recipe.getIngredients());
            }
        }


    }
}
