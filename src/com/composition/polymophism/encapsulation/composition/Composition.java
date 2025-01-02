package com.composition.polymophism.encapsulation.composition;

public class Composition {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Dell", "245");
        Monitor monitor = new Monitor("27Inch Beast", "Accer",27,"2540 X 1440");
        MotherBoard motherBoard = new MotherBoard("BJ-10209","Asus",4,4,"v2.245");
        PersonalComputer personalComputer = new PersonalComputer("2209", "Dell", monitor, motherBoard, computerCase);

//        personalComputer.getMonitor().drawPixelAt(10,23,"red");
//        personalComputer.getMotherBoard().loadProgram("Windows OS");
//        personalComputer.getComputerCase().pressPowerButton();
//        personalComputer.powerUp();

        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.getBrewMaster().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getIceBox().setHasWorkToDo(true);
//
//        smartKitchen.getBrewMaster().brewCoffee();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getIceBox().orderFood();

        smartKitchen.setKitchenState(true, false, false);
        smartKitchen.doKitchenWork();
    }
}
