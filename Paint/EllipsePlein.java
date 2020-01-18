import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EllipsePlein extends Figure {

    private Color color;

    public EllipsePlein() { }

    public EllipsePlein(int x, int y, int w, int h) {
        this.x1 = x;
        this.y1 = x;
        this.x2 = w;
        this.y2 = h;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

