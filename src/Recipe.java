import java.util.ArrayList;

//Attributes
public class Recipe {
    private String title;
    private int numberOfPeople;
    private ArrayList<String> ingredients;
    private ArrayList<String> instructions;

//Constructor
    public Recipe(String title, int numberOfPeople, ArrayList<String> ingredients, ArrayList<String> instructions) {
        this.title = title;
        this.numberOfPeople = numberOfPeople;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

//Getters
    public String getTitle() {
        return title;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

//ToString
    public String toStrin(){
        return
                        ("Title: " + title + "\n")+
                        ("Serves " + numberOfPeople + " people \n")+
                        ("Ingredients:" + ingredients + "\n")+
                        ("Instructions: " + instructions + "\n");
    }
}


