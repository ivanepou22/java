package com.composition.polymophism.encapsulation.polymorphism;

public class Cars {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Cars(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return String.format("Car: %s -> is starting", getClass().getSimpleName());
    }

    public String accelerate() {
        return String.format("Car: %s -> is Accelerating", getClass().getSimpleName());
    }

    public String brake() {
        return String.format("Car: %s -> is braking", getClass().getSimpleName());
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Cars{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

//    @Override
//    public String startEngine() {
//        return super.startEngine();
//    }
//
//    @Override
//    public String accelerate() {
//        return super.accelerate();
//    }
//
//    @Override
//    public String brake() {
//        return super.brake();
//    }
}

class Holden extends Cars{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

//    @Override
//    public String startEngine() {
//        return super.startEngine();
//    }
//
//    @Override
//    public String accelerate() {
//        return super.accelerate();
//    }
//
//    @Override
//    public String brake() {
//        return super.brake();
//    }
}

class Ford extends Cars {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

//    @Override
//    public String startEngine() {
//        return super.startEngine();
//    }
//
//    @Override
//    public String accelerate() {
//        return super.accelerate();
//    }
//
//    @Override
//    public String brake() {
//        return super.brake();
//    }
}
