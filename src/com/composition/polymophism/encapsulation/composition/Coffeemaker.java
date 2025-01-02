package com.composition.polymophism.encapsulation.composition;

public class Coffeemaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
        System.out.println("Coffee Brewing");
        hasWorkToDo = false;
        }
    }
}
