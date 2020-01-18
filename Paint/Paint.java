import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Graphics;

public class Paint extends JFrame implements Serializable{
    private static final long serialVersionUID = 1L;
    public ArrayList<Figure> figures = new ArrayList<Figure>();
    public Figure figu;

    public Paint(String titre, int w, int h) {
        super(titre);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel pN = new JPanel();
        this.add(pN, BorderLayout.NORTH); // 0

        JPanel pC = new JPanel();
        this.add(pC, BorderLayout.CENTER); // 1
        pC.setLayout(new BorderLayout());



        /*

        JButton rectangle = new JButton("Rectangle");
        JButton rectangleP = new JButton("RectanglePlein");
        //JButton carre = new JButton("Carre");
        JButton cercle = new JButton("Cercle");
        JButton cercleP = new JButton("CerclePlein");
        JButton ellipse = new JButton("Ellipse");
        JButton segment = new JButton("Segment");
        JButton triangle = new JButton("Triangle");
        pN.add(rectangle);
        pN.add(rectangleP);
        //pN.add(carre);
        pN.add(cercle);
        pN.add(cercleP);
        pN.add(ellipse);
        pN.add(segment);
        pN.add(triangle);
        rectangle.addActionListener(new PaintActionButton());
        rectangleP.addActionListener(new PaintActionButton());
        //carre.addActionListener(new PaintActionButton());
        cercle.addActionListener(new PaintActionButton());
        ellipse.addActionListener(new PaintActionButton());
        cercleP.addActionListener(new PaintActionButton());
        segment.addActionListener(new PaintActionButton());
        triangle.addActionListener(new PaintActionButton());

        */

        JButton save = new JButton("Save");
        pN.add(save);
        save.addActionListener(new PaintActionSave(this,figures));

        JButton load = new JButton("Load");
        pN.add(load);
        load.addActionListener(new PaintActionSave(this,figures));


        JTabbedPane tp = new JTabbedPane(); //Les 3 boutons
        tp.addChangeListener(new PaintActionTab(this));

        pC.add(tp);
        PaintView p1 = new PaintView(figures); //Les Panels voulu, donc acceuil et autre
        JPanel p2 = new JPanel(); //Text, avec ce qu'on a fait plus tôt
        p2.setLayout(new BorderLayout());

        JPanel pNT = new JPanel();
        p2.add(pNT, BorderLayout.NORTH); // 0

        JPanel pCT = new JPanel();
        p2.add(pCT, BorderLayout.CENTER); // 0
        JTextArea txt = new JTextArea(50,50);
        pCT.add(txt);
        JButton enter = new JButton("Enter");
        enter.addActionListener(new PaintActionText());
        pNT.add(enter);



        tp.add("Figure", p1);
        tp.add("Texte", p2);




        p1.addMouseListener(new PaintAction());

        addKeyListener(new PaintActionKeyboard(this));

        setFocusable(true);
        this.setSize(w, h);
        this.setVisible(true);
    }

    //public void addFigure(Figure fig){
    //    figures.add(fig);

    /*public void draw(Graphics g){
        for (Figure f : figures){
            f.draw(g);
        }
    }*/

    /*public void DrawRect(Graphics g, Figure fig){
        int[] coord = fig.getCoord();
        g.drawRect(coord[0],coord[1],coord[2],coord[3]); //à completer
    }
    */
    /*
    public void keyPressed(KeyEvent k){
        System.out.println(k.getKeyChar());
    }
    public void keyReleased(KeyEvent k){
        System.out.println(k.getKeyChar());
    }
    public void keyTyped(KeyEvent k){
        System.out.println(k.getKeyChar());
    }

    */

    public static void main(String[] arg) throws Exception {
        new Paint("Paint.net", 600, 400);
    }




}