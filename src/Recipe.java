import java.util.ArrayList;

//Attributes
public class Recipe {
    private typeOfRecipe type;
    private String title;
    private int numberOfPeople;
    private String ingredients;
    private String instructions;


//Constructor
    public Recipe(typeOfRecipe type, String title, int numberOfPeople, String ingredients, String instructions) {
        this.type = type;
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

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public typeOfRecipe getTypeOfRecipe() {
        return type;
    }

//ToString
    public String toString(){
        return
                        ("Category: " + type + "\n")+
                        ("Title: " + title + "\n")+
                        ("Serves " + numberOfPeople + " people \n")+
                        ("Ingredients:" + ingredients + "\n")+
                        ("Instructions: " + instructions + "\n");

    }
}


