package com.company;
import  java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        double minNumberTemp = 0;
        double maxNumberTemp = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number: ");
            String inputString = scanner.nextLine();
            try {
                double number = Double.parseDouble(inputString);
                if ((minNumberTemp == 0) && (maxNumberTemp == 0)){
                    minNumberTemp = number;
                    maxNumberTemp = number;
                } else {
                    if (minNumberTemp > number) {
                        minNumberTemp = number;
                    } else {
                       if (maxNumberTemp < number) {
                           maxNumberTemp = number;
                       }
                    }
                }
            }
            catch (NumberFormatException e){
                break;
            }
        }

        System.out.println("Min: "+minNumberTemp);
        System.out.println("Max: "+maxNumberTemp);
    }
}
