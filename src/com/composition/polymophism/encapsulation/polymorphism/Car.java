package com.composition.polymophism.encapsulation.polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Start Engine");
    }
    public void drive() {
        System.out.println("Car -> driving, type is "+ getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Engine Running!");
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;
    private double fuelLevel;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders, double fuelLevel) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up,Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    private double batteryLevel;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize, double batteryLevel) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kwh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> cylinders %d are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kwh batter on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below the average: %.2f %n", avgKmPerLitre);
    }
}
