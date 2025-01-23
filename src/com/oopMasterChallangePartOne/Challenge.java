package com.oopMasterChallangePartOne;

public class Challenge {
    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke",1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado",1.5);
//        avocado.printItem();

//        Burger bg = new Burger("regular", 4.0);
//        bg.addToppings("BACON", "CHEESE", "MAYO");
//        bg.printItem();

//        Meal meal = new Meal();
//        meal.addBurgerToppings("BACON", "CHEESE","MAYO");
//        meal.setDrinkSize("LARGE");
//        meal.printItemizedList();

//        Meal secondMeal = new Meal("Turkey", "7-up","Chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        Meal deluxe = new Meal("Deluxe", "7-up","Chili");
        deluxe.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxe.setDrinkSize("SMALL");
        deluxe.printItemizedList();
    }
}
