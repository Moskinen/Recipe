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
    public static void viewAllRecipes() {

    }
}
