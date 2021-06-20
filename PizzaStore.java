public class PizzaStore {
    public Pizza orderSimplePizza() {
        Pizza sp = new ThinDough();
        sp.addIngredient(new Cheese());
        sp.addIngredient(new Tomato());
        return sp;
    }

    public Pizza orderOnlyMeatPizza() {
        Pizza om = new ThickDough();
        om.addIngredient(new Cheese());
        om.addIngredient(new Pepperoni());

        return om;
    }

    public Pizza orderVegetarianPizza() {
        Pizza vp = new ThinDough();
        vp.addIngredient(new Cheese());
        vp.addIngredient(new Tomato());
        vp.addIngredient(new BBQSauce());

        return vp;
    }

    public Pizza addIngredient(Pizza pizza, Ingredient ingredient) {
        pizza.addIngredient(ingredient);
        return pizza;
    }
}
