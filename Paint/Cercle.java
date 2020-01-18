import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cercle extends Figure {

    private Color color;

    public Cercle() {
    }

    public Cercle(int x, int y, int w, int h) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = w;
        this.y2 = w;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}