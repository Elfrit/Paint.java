import java.awt.Color;

import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Segment extends Figure{
    private Color color;

    public Segment() {
    }

    public Segment(int x, int y, int w, int h) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = w;
        this.y2 = h;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public boolean appartientSeg(Gomme g) {
        //Point p = new Point(x,y);
        int x = g.getX();
        int y = g.getY();

        int x1 = this.getX1();
        int y1 = this.getY1();
        int x2 = this.getX2();
        int y2 = this.getY2();

        if ((x2-x1)/(y2-y1) == (x-x1)/(y-y1)) {
            // M est sur la droite formée par A-B
            if( x<=x2 && x>=x1) {
                // M est sur le segment A-B
                return true;
            }
        }
        return false;
        //if (xSeg > xSeg2) {
        //    xSeg = xSeg + xSeg2; // x now becomes 15
        //    xSeg2 = xSeg - xSeg2; // y becomes 10
        //    xSeg = xSeg - xSeg2; // x becomes 5
        //}
        //if (ySeg > ySeg2) {
        //    xSeg = xSeg + xSeg2; // x now becomes 15
        //    xSeg2 = xSeg - xSeg2; // y becomes 10
        //    xSeg = xSeg - xSeg2; // x becomes 5
        //}
        //while (xSeg < xSeg2 || ySeg < ySeg2) {
        //    if (xSeg == x && ySeg == y && xSeg2 == x && ySeg2 == y)
        //        return true;
        //    if (xSeg < xSeg2)
        //        xSeg++;
        //    if (ySeg < ySeg2)
        //        ySeg++;
        //}
        //return false;
    }
}