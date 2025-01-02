package com.composition.polymophism.encapsulation.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
//        Player player = new Player("Tim", 200, "Sword");
//        System.out.println("Initial health is "+ player.healthRemaining());
    Printer printer = new Printer(50, true);
        System.out.println("Initial page count = "+ printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}
