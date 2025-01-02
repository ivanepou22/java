package com.composition.polymophism.encapsulation.composition;

public class SmartKitchen {
    Coffeemaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new Coffeemaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

//    public void addWater(){
//        brewMaster.setHasWorkToDo(true);
//    }
//    public void pourWater(){
//        iceBox.setHasWorkToDo(true);
//    }
//    public void loadDishes(){
//        dishWasher.setHasWorkToDo(true);
//    }

    public Coffeemaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
    //
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
