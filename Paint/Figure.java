import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Figure extends JPanel{
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected Color color;

    public Figure(){
        this.x1=0;
        this.y1=0;
        this.x2=0;
        this.y2=0;
    }

    public Figure(int x, int y, int x2, int y2){
        this.x1=x;
        this.y1=y;
        this.x2=x2;
        this.y2=y2;
    }

    /*
    public int[] getCoord(){
        int[] coords = {this.x1, this.y1, this.x2, this.y2};
        return coords;
    }
    */

    public void setX1(int x1){
        this.x1=x1;
    }

    public void setY1(int y1){
        this.y1=y1;
    }

    public void setX2(int x2){
        this.x2=x2;
    }

    public void setY2(int y2){
        this.y2=y2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }
    //public abstract void Dessiner();

    public boolean appartient(Gomme g){
        if(g.getX() >= this.getX1() && g.getY() >= this.getY1() && g.getX() <= (this.getX2() + this.getX1()) && g.getY() <= (this.getY2() + this.getY1()))
            return true;
        return false;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}