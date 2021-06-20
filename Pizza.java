import java.util.ArrayList;

public abstract class Pizza extends AbstractFood {
    ArrayList<Ingredient> ingredients;

    Pizza() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        String fullName = "Pizza: " + this.name;
        for (int i = 0; i < ingredients.size(); i++) {
            fullName = fullName + ", " + ingredients.get(i).getName();
        }
        return fullName;
    }

    public int getCalories() {
        int totalCalories = this.calories;
        for (int i = 0; i < ingredients.size(); i++) {
            totalCalories += ingredients.get(i).getCalories();
        }
        return totalCalories;
    }

    public int getPrice() {
        int totalPrice = this.price;
        for (int i = 0; i < ingredients.size(); i++) {
            totalPrice += ingredients.get(i).getPrice();
        }
        return totalPrice;
    }
}
