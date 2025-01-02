package com.company;

public class Car {
//Variable => fields, member variables.
    private int doors;
    private int wheels;  //state of the object.
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("barrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
