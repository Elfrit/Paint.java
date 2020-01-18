import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarrePlein extends Figure {
    private Color color;

    public CarrePlein() { }

    public CarrePlein(int x, int w, int h, Color color) {
        this.x = x;
        this.y = x;
        this.w = w;
        this.h = h;
        this.color=color;
    }

    public void paintComponent (Graphics g){
        try {
            super.paintComponent(g);
            g.fillRect(this.x, this.y, this.w, this.h);
            g.setColor(this.color);
        }
        catch (Exception e) {
        }
    }
}

