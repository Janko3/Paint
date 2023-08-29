package models;

import java.awt.*;

public class Circle extends Shape {
    private Point center;
    private int radius;


    public Circle(boolean selected, Point center, int radius) {
        super(selected);
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics g){
        g.drawOval(this.getCenter().getX() - this.getRadius(),
                this.getCenter().getY() - this.getRadius(),
                this.getRadius()*2,
                this.getRadius()*2);
        if(isSelected() == true){
            g.drawRect(this.getCenter().getX()-3,this.getCenter().getY()-3,6,6);

            g.drawRect(this.getCenter().getX()-3,this.getCenter().getY()-this.getRadius()-3,6,6);

            g.drawRect(this.getCenter().getX()-3,this.getCenter().getY()+this.getRadius()-3,6,6);

            g.drawRect(this.getCenter().getX()-this.getRadius()-3,this.getCenter().getY()-3,6,6);

            g.drawRect(this.getCenter().getX() + this.getRadius()-3,this.getCenter().getY()-3,6,6);
        }
    }

    @Override
    public boolean contains(int x,int y){
        return this.getCenter().distance(x, y) <= this.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
