package com.composition.polymophism.encapsulation.polymorphism;

import java.util.Scanner;

public class Polymorphism {
    public enum Days  { MON,TUE,WED,THUR,FRI,SAT,SUN }
    public static void main(String[] args) {
//        Movie movie = new Adventure("Star wars");
//        movie.watchMovie();

//        Movie movie = Movie.getMovie("Science", "Star Wars");
//        movie.watchMovie();

//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Enter Type (A for Adventure, C for comedy, "+ "S for Science Fiction or Q to quit");
//            String type = scanner.nextLine();
//            if ("Qq".contains(type)){
//                break;
//            }
//            System.out.println("Enter Movie Title: ");
//            String title = scanner.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }
//        Days[] m = Days.values();
//        Days t = Days.valueOf("MON");
//        Days mn = Days.MON;
//        System.out.println(t);
//        System.out.println(mn);
//    Car car = new Car("2024 Ferrari Enzo");
//    runRace(car);

//    Car ferrari = new GasPoweredCar("2024 Ferrari Enzo",2.5, 5, 10);
//    runRace(ferrari);
//        System.out.println("............................");
//    Car tesla = new ElectricCar("2024 Red Tesla Model X", 568, 75,75);
//    runRace(tesla);

//        Car ferrariHybrid = new HybridCar("2024 Black Ferrari SF90 Stradale", 16,6,8);
//        runRace(ferrariHybrid);
        
//        Cars car = new Cars(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Cars ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
