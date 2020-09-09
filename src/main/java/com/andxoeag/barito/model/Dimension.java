package com.andxoeag.barito.model;

public class Dimension {

    private double length;

    private double width;

    public Dimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int fold) {
        length /= Math.pow(2, fold);
    }

    public void setWidth(int fold) {
        width /= Math.pow(2, fold);
    }

    public String toString() {
        return length + " x " + width;
    }

}
