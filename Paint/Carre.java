import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
        import java.io.*;
        import java.awt.Graphics;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Carre extends Figure {

    public Carre() {
    }

    public Carre(int x, int y , int w, int h) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = w;
        this.y2 = w;
    }

}