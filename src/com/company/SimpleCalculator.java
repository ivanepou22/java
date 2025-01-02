package com.company;

public class SimpleCalculator {
    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return getFirstNumber()+getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }
    public double getDivisionResult(){
        if (getSecondNumber() == 0){
            return 0d;
        }
        return getFirstNumber()/getSecondNumber();
    }
}
