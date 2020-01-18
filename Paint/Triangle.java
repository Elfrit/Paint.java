import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle extends Figure {
    protected int[] tab_x = {0, 0, 0};
    protected int[] tab_y = {0, 0, 0};
    protected int w;
    private boolean[] test = {false, false, false};
    private Color color;

    public Triangle() {
    }

    public Triangle(int[] x, int[] y, int w) {
        this.tab_x = x;
        this.tab_y = y;
        this.w = w;
    }

    public void setX(int i, int x) {
        this.tab_x[i] = x;
    }

    public void setY(int i, int y) {
        this.tab_y[i] = y;
    }

    public int[] getTabX() {
        return tab_x;
    }

    public int[] getTabY() {
        return tab_y;
    }

    public String getTab(){
        return ("X= "+this.tab_x[0]+","+this.tab_x[1]+","+this.tab_x[2]+"\nY= "+this.tab_y[0]+","+this.tab_y[1]+","+this.tab_y[2]);
    }

    public boolean getTest(int i) {
        return test[i];
    }

    public void setTest(int i, boolean test) {
        this.test[i] = test;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    static boolean appartient(int x1, int y1, int x2,
                            int y2, int x3, int y3, int x, int y)
    {
        /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }

    static double area(int x1, int y1, int x2, int y2,
                       int x3, int y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }
}

