package main;

import models.Rectangle;
import view.Drawing;
import view.RectangleWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new RectangleWindow());


    }
}