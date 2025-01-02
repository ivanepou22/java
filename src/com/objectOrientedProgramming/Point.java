package com.objectOrientedProgramming;

public class Point {
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    //(0-x)(0-x)+(0-y)(0-y)
    //√((x2 – x1)² + (y2 – y1)²)
    // point (6,5), point(0,0)
    //x1=6,x2=0 y1=5,y2=0
    //((0-6)2 + (0-5)2
    //36+25
    //61

    public double distance(){
        return distance(0,0);
    }

    public double distance(Point w) {
        int xDistance = w.getX();
        int yDistance = w.getY();
        return distance(xDistance, yDistance);
    }
    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x-this.x)) +((y - this.y)*(y-this.y)));
    }
}
