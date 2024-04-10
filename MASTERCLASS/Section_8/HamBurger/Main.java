package MASTERCLASS.Section_8.HamBurger;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("Coke","Drink",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Avocado","Topping",1.75);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder meal = new MealOrder();
//        meal.addBurgerToppings("BACON","CHEESE","MAYO");
//        meal.setDrinkSize("LARGE");
//        meal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chilli");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxe = new MealOrder("Deluxe","Coke","Chilli");
        deluxe.addBurgerToppings("BACON","CHEESE","LETTUCE","AVOCADO","MAYO");
        deluxe.setDrinkSize("SMALL");
        deluxe.printItemizedList();
    }
}
