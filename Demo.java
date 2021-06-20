public class Demo {
    public static void main(String[] args) {
        Pizza p1 = new ThinDough();
        p1.addIngredient(new Pepperoni());
        p1.addIngredient(new Tomato());
        p1.addIngredient(new Cheese());
        p1.addIngredient(new BBQSauce());

        System.out.println(p1.getName());
        System.out.println(p1.getCalories());
        System.out.println(p1.getPrice());

        PizzaStore pizzaStore = new PizzaStore();
        Pizza simplePizza = pizzaStore.orderSimplePizza();
        System.out.println(simplePizza.getName());
        System.out.println(simplePizza.getCalories());
        System.out.println(simplePizza.getPrice());

        Pizza onlyMeat = new PizzaStore().orderOnlyMeatPizza();
        System.out.println(onlyMeat.getName());
        System.out.println(onlyMeat.getCalories());
        System.out.println(onlyMeat.getPrice());

        Pizza vegetarian = new PizzaStore().orderVegetarianPizza();
        System.out.println(vegetarian.getName());
        System.out.println(vegetarian.getCalories());
        System.out.println(vegetarian.getPrice());

        simplePizza = pizzaStore.addIngredient(simplePizza, new Tomato());
        System.out.println(simplePizza.getName());
    }
}
