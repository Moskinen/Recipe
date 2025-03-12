import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<Recipe> recipeBook = new ArrayList<>();

    //Showing menu options with switch case, invoking methods from Methods class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Recipe Menu options:");

        boolean running = true;
        while (running) {
            Methods.displayMenu();
            System.out.println("Enter a number between 1 and 6");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Methods.addNewRecipe();
                    break;
                case 2:
                    Methods.searchAllRecipes();
                    break;
                case 3:
                    System.out.println("Search");
                    break;
                case 4:
                    System.out.println("Choose category");
                    break;
                case 5:
                    System.out.println("Give comment");
                    break;
                case 6:
                    System.out.println("Give rating");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

}
