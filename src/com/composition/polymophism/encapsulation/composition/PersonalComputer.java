package com.composition.polymophism.encapsulation.composition;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, MotherBoard motherBoard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }

    private void drawLogo() {
        monitor.drawPixelAt(200, 3400,"Red");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
}
