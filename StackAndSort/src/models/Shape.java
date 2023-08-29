package models;

import java.awt.*;

public abstract class Shape {
    private boolean selected;

    public Shape(boolean selected) {
        this.selected = selected;
    }

    public Shape() {
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public abstract void draw(Graphics g);
    public  abstract boolean contains(int x,int y);
}
