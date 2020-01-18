import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.*;


public class PaintAction extends MouseAdapter {
    int[] test = {0,0};

    public PaintAction() {
        super();
        //this.fig=((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu;
        //this.arr=((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figures;
    }

    public void mouseClicked(MouseEvent e) {
        Figure fig = ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figu;
        if (fig instanceof Texte) {
            int x = e.getX();
            int y = e.getY();
            Texte tex = (Texte) fig;
            tex.setX(x);
            tex.setY(y);
            ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figures.add(tex);
        }

        if (fig instanceof Gomme) {
            int x = e.getX();
            int y = e.getY();
            Gomme gom = (Gomme) fig;
            gom.setX(x);
            gom.setY(y);
            int j;
            ArrayList<Figure> figures = ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figures;
            for (j=figures.size()-1; j>=0; j--){
                try {
                    //System.out.println(figures.get(j).appartient(gom));
                    if (figures.get(j) instanceof Segment) {
                        Segment seg = (Segment) figures.get(j);
                        System.out.println(seg.appartientSeg(gom));
                        if (seg.appartientSeg(gom)){
                            figures.remove(j);
                            j = -1;
                        }
                        ////Point p = new Point(x,y);
                        //int xSeg = seg.getX1();
                        //int ySeg = seg.getY1();
                        //int xSeg2 = seg.getX2();
                        //int ySeg2 = seg.getY2();
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
                        //while (xSeg<xSeg2 || ySeg<ySeg2) {
                        //    System.out.println("Je passe là");
                        //    if (xSeg == x && ySeg ==y && xSeg2 == x && ySeg2 == y) {
                        //        figures.remove(j);
                        //        return;
                        //    }
                        //    if (xSeg<xSeg2)
                        //        xSeg++;
                        //    if (ySeg<ySeg2)
                        //        ySeg++;
                        //}

                    }
                    if (figures.get(j) instanceof Texte) {
                        Texte txt = (Texte) figures.get(j);
                        System.out.println(txt.appartientTxt(gom));
                        if (txt.appartientTxt(gom)){
                            figures.remove(j);
                            j = -1;
                        }

                    }
                    else {
                        if (figures.get(j).appartient(gom)) {
                            figures.remove(j);
                            j = -1;
                        }
                    }

                    if (figures.get(j) instanceof Triangle) {
                        Triangle trg = (Triangle)figures.get(j);

                        ////System.out.println(Triangle.appartient());
//
                        int[] tab_x = trg.getTabX();
                        int[] tab_y = trg.getTabY();

                        Segment seg1= new Segment(tab_x[0],tab_y[0],tab_x[1],tab_y[1]);
                        Segment seg2= new Segment(tab_x[1],tab_y[1],tab_x[2],tab_y[2]);
                        Segment seg3= new Segment(tab_x[2],tab_y[2],tab_x[0],tab_y[0]);
//
                        //System.out.println("je passe ici");
                        if (seg1.appartientSeg(gom) || seg2.appartientSeg(gom) || seg3.appartientSeg(gom)){
                            System.out.println("je passe encore");
                            figures.remove(j);
                            return;
                        }
                        //if (Triangle.appartient(tab_x[0],tab_y[0],tab_x[1],tab_y[1],tab_x[2],tab_y[2],gom.getX(),gom.getY())){
                        //    figures.remove(j);
                        //    j = -1;
                        //}
                    }

                    if (figures.get(j) instanceof TrianglePlein) {
                        Triangle trg = (Triangle)figures.get(j);

                        ////System.out.println(Triangle.appartient());
//
                        int[] tab_x = trg.getTabX();
                        int[] tab_y = trg.getTabY();

                        Segment seg1= new Segment(tab_x[0],tab_y[0],tab_x[1],tab_y[1]);
                        Segment seg2= new Segment(tab_x[1],tab_y[1],tab_x[2],tab_y[2]);
                        Segment seg3= new Segment(tab_x[2],tab_y[2],tab_x[0],tab_y[0]);
//
                        System.out.println("je passe ici");

                        if (seg1.appartientSeg(gom) || seg2.appartientSeg(gom) || seg3.appartientSeg(gom)){
                            System.out.println("je passe ici");
                            figures.remove(j);
                            j = -1;
                        }
                        //if (Triangle.appartient(tab_x[0],tab_y[0],tab_x[1],tab_y[1],tab_x[2],tab_y[2],gom.getX(),gom.getY())){
                        //    figures.remove(j);
                        //    j = -1;
                        //}
                    }

                }
                catch(Exception ex){}
            }
        }

        if (fig instanceof Triangle || fig instanceof TrianglePlein) {
            Triangle trg=(Triangle) fig;
            int i = e.getClickCount();
            //((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu

            //int[] tab_x =trg.getTabX(); //Juste pour la verification des coordonnées
                if (i == 1 && this.test[0]==0) {
                    int x = e.getX();
                    int y = e.getY();
                    trg.setX(0, x);
                    trg.setY(0, y);
                    this.test[0]=1; //Test c'est une variable d'instance pour passer à une autre coords, c'est une vérification quoi
                    trg.setTest(0,true);
                }
                else if (i == 1 && (this.test[0]!=0 && this.test[1]==0)) {
                    int x = e.getX();
                    int y = e.getY();
                    trg.setX(1, x);
                    trg.setY(1, y);
                    this.test[1]=1;
                    trg.setTest(1,true);

                }
                else if (i == 1 && (this.test[0]!=0 && this.test[1]!=0)) {
                    int x = e.getX();
                    int y = e.getY();
                    trg.setX(2, x);
                    trg.setY(2, y);
                    this.test[0]=0;
                    this.test[1]=0;
                    trg.setTest(2,true);
                }
            //System.out.println(i);
               // System.out.println(tab_x[0]+","+tab_x[1]+","+tab_x[2]);
                System.out.println(trg.getTab());
            ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figures.add(trg);

        }

    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        Figure fig = ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figu;
        int x1 = e.getX();
        int y1 = e.getY();
        //((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu.setX1(x1);
        //((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu.setY1(y1);
        fig.setX1(x1);
        fig.setY1(y1);


        System.out.println(((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figu);
    }

    public void mouseReleased(MouseEvent e) {
        int x2 = e.getX();
        int y2 = e.getY();
        Figure fig = ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figu;
        if (fig instanceof Segment) {
            fig.setX2(x2);
            fig.setY2(y2);
            ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figures.add(fig);
        }
        if ((!(fig instanceof Triangle))&&!(fig instanceof Segment) && !(fig instanceof Gomme ) && !(fig instanceof Texte )) {
            {
                //((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu.setX2(x2);
                //((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu.setY2(y2);
                int x1 = fig.getX1();
                int y1 = fig.getY1();

                if (x2<x1 && y2>y1){
                    fig.setX1(x2);
                   // fig.setY1(y2);
                    fig.setX2(x1 - fig.getX1());
                    fig.setY2(y2 - fig.getY1());
                }
                else if (x2>x1 && y2<y1){
                    //fig.setX1(x2);
                    fig.setY1(y2);
                    fig.setX2(x2 - fig.getX1());
                    fig.setY2(y1 - fig.getY1());
                }

                else if (x2<x1 && y2<y1){

                    fig.setX1(x2);
                    fig.setY1(y2);
                    fig.setX2(x1 - fig.getX1());
                    fig.setY2(y1 - fig.getY1());
                }
                else{
                    fig.setX2(x2 - fig.getX1());
                    fig.setY2(y2 - fig.getY1());
                }
                ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figures.add(fig);
            }
        }
    }
}