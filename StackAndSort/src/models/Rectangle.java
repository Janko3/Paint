package models;

import java.awt.*;

public class Rectangle  {
    private int a;

    private int b;
    private int width;
    private int height;
    private int area;

    public Rectangle(int a, int b, int width, int height,int area) {
        this.a = a;
        this.b = b;
        this.width = width;
        this.height = height;
        this.area = area;
    }
    public Rectangle(int a, int b, int width, int height) {
        this.a = a;
        this.b = b;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "A: " + a + ",B: " + b + ",Width: " + width + ",Height: " + height + ",Area: " + area;

    }
}