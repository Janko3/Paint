package models;

import java.awt.*;

public class Line extends Shape {
    private Point start;
    private Point end;


    public Line(boolean selected, Point start, Point end) {
        super(selected);
        this.start = start;
        this.end = end;
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(){

    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public void draw(Graphics g){
        g.drawLine(this.getStart().getX(),this.getStart().getY(),this.getEnd().getX(),this.getEnd().getY());
        if(isSelected() == true){
            g.drawRect(this.getStart().getX()-3,this.getStart().getY()-3,6,6);
            g.drawRect(this.getEnd().getX()-3,this.getEnd().getY()-3,6,6);
            g.drawRect(this.middleOfLine().getX()-3,this.middleOfLine().getY()-3,6,6 );
        }
    }
    public Point middleOfLine(){
        int middleX = (this.getStart().getX() + this
                .getEnd().getX())/2;
        int middleY = (this.getStart().getY() + this.getEnd().getY())/2;
        Point middle = new Point(middleX,middleY);
        return middle;
    }
    public double length(){
        return start.distance(end.getX(),end.getY());
    }
    @Override
    public boolean contains(int x,int y){
        return (start.distance(x, y) + end.distance(x, y)) - length() < 0.1;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

