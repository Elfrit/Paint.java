import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RectanglePlein extends Figure {
    private Color color;

    public RectanglePlein() {
    }

    public RectanglePlein(int x, int y, int w, int h) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = w;
        this.y2 = h;
    }

    public String toString(){
        return "RectP= "+x1+y1+x2+y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}