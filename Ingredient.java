public abstract class Ingredient extends AbstractFood {
    public String getName() {
        return this.name;
    }
    public int getCalories() { return this.calories; }
    public int getPrice() { return this.price; }
}
