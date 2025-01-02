package com.inheritance;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal animal = new Animal("Generic Animal","Huge",400);
//        doAnimalStuff(animal, "slow");
//
//        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");
//
//        Dog yorkie = new Dog("Yorkie", 15);
//        doAnimalStuff(yorkie, "slow");
//        Dog retriever = new Dog("Labrador Retriever", 65, "floppy","Swimmer");
//        doAnimalStuff(retriever, "Fast");
//        Dog wolf = new Dog("Wolf", 40);
//        doAnimalStuff(wolf, "slow");
//
//        Fish goldie = new Fish("Goldfish", 0.25,2,3);
//        doAnimalStuff(goldie, "fast");

//        Employee ivan = new Employee("Ivan", "12-30-1992","11/11/2020");
//        System.out.println(ivan);
//        System.out.println("Age= "+ivan.getAge());
//        System.out.println("Pay= "+ivan.collectPay());

//        SalariedEmployee joe = new SalariedEmployee("Joe","12-03-1920","11-11-1940",220000);
//        System.out.println(joe);
//        System.out.println("Joe's Paycheck = $"+ joe.collectPay());
//        joe.retire();
//        System.out.println("Joe's Pension check = $"+ joe.collectPay());
//        System.out.println("-------------------------");
//        HourlyEmployee mary = new HourlyEmployee("Mary","10-10-1998","01-01-2022",35);
//        System.out.println(mary);
//        System.out.println("Mary's Paycheck = $"+mary.collectPay());
//        System.out.println("Mary's Holiday pay = $"+mary.getDoublePay());

//        Circle circle = new Circle(-3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------");
    }
}
