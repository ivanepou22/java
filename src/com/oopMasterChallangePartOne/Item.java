package com.oopMasterChallangePartOne;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        switch (size) {
            case "SMALL":
                return getBasePrice() - 0.5;
            case "LARGE":
                return getBasePrice() + 1;
            default: return getBasePrice();
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }
}
