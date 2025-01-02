package com.objectOrientedProgramming;

public class Car {
     private  String make = "Tesla";
     private  String model = "Model X";
     private  String color = "Gray";
     private  int doors = 4;
     private  boolean convertible = true ;

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public int getDoors() {
        return doors;
    }

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "porsche":
            case "tesla":
            case "holden": {
                this.make = make;
                break;
             }
            default: {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public  void  describeCar(){
         System.out.println(
                 doors+"-Doors "+color+ " "+make+" "+model+" "+
                         (convertible ? "Convertible":" ")
         );
     }
}
