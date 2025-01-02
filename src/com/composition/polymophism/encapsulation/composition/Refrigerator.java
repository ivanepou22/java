package com.composition.polymophism.encapsulation.composition;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Food ordered!");
            hasWorkToDo = false;
        }
    }
}
