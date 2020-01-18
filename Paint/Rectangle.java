import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rectangle extends Figure{

    private Color color;

    public Rectangle(int x, int y, int x2, int y2) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String toString(){
        return "Rect"+x1+","+y1+","+x2+","+y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}