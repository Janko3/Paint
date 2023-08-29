package models;

import java.awt.*;

public class Point extends Shape{
    private int x;
    private int y;

    public Point(boolean selected, int x, int y) {
        super(selected);
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

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

    @Override
    public void draw(Graphics g){
        g.drawLine(this.getX()-2,this.getY(),this.getX()+2,this.getY());
        g.drawLine(this.getX(),this.getY()-2,this.getX(),this.getY()+2);

        if (isSelected()==true){
            g.drawRect(this.getX()-3,this.getY()-3,6,6);
        }
    }
    public double distance(int x,int y){
        double dx = this.x -x;
        double dy = this.y - y;
        double d = Math.sqrt(dx*dx + dy*dy);
        return d;

    }
    @Override
    public boolean contains(int x,int y){
        return this.distance(x,y)<=3;
    }



    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
