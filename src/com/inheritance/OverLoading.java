package com.inheritance;

public class OverLoading {
    public double sum(double x, int y) {
        return x*y;
    }
    public double sum(int x, double y) {
        return x*y;
    }
}
