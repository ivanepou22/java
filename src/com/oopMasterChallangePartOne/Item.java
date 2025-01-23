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
            return size+ " "+ name;
        }
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice() {
        double adjustedPrice = 0;

        switch(size) {
            case "SMALL": {
                adjustedPrice = getPrice() - 0.5;
                break;
            }
            case "LARGE": {
                adjustedPrice = getPrice() + 1;
                break;
            }
            default: adjustedPrice = getPrice();
        };
        return  adjustedPrice;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
