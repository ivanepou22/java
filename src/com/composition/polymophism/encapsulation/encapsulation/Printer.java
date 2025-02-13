package com.composition.polymophism.encapsulation.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel: -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;
        if(tonerLevel < 0 || tonerLevel > 100) return -1;
        return tonerLevel;
    }
    public int printPages(int pages) {
       int jobPages = duplex ? (pages/2) + (pages % 2) : pages;
       pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
