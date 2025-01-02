package com.objectOrientedProgramming;

public class MainClassOop {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setModel("Cayenne");
//        car.setMake("Porsche");
//        car.setColor("Black");
//        car.setDoors(4);
//        car.setConvertible(true);
//        car.describeCar();

//        AccountBank accountBank = new AccountBank();
//        accountBank.setCustomerName("Ivan Epou");
//        accountBank.setEmail("ivanepou92@gmail.com");
//        accountBank.setAccountNumber("0101209398343");
//        accountBank.setPhoneNumber("+256700485851");
//        accountBank.setBalance(100);
//        accountBank.depositFunds(1000);
//        accountBank.withdrawFunds(800);

//        Account accountBank = new Account("01010192092091","Evans",100.00,"evans@gmail.com","256-700-485851");
//        Account accountBank = new Account();
//        accountBank.setBalance(100);
//        accountBank.depositFunds(1000);
//        accountBank.withdrawFunds(800);
//        for (int i =1; i<=5; i++){
//            String name;
//            switch(i) {
//                case 1: name ="Ivan"; break;
//                case 2: name = "Epou"; break;
//                case 3: name = "Leivan"; break;
//                case 4: name = "Dyron"; break;
//                case 5: name = "Dylan"; break;
//                default:name ="Anonymus";
//            }
//            Student s = new Student(
//                    "ST-000"+ i,
//                    name,
//                    "30-12-1992"
//            );
//            System.out.println(s);
//        }

//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
