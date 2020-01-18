import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PaintView extends JPanel{

    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public PaintView(ArrayList<Figure> figures){
        this.figures=figures;
    }



    public void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            //for (Figure f : figures) {
            repaint();

            //System.out.println(figures.size());

            for (int i = 0; i < figures.size(); i++) {
                if (figures.get(i) instanceof Rectangle) {
                    //Figure fig = figures.get(i);
                    g.setColor(figures.get(i).getColor());
                    g.drawRect((figures.get(i)).getX1(), (figures.get(i)).getY1(), (figures.get(i)).getX2(), (figures.get(i)).getY2());

                }
                if (figures.get(i) instanceof RectanglePlein) {
                    g.setColor(figures.get(i).getColor());
                    g.fillRect(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getY2());

                }
                //if (figures.get(i) instanceof Carre) {
                //    g.drawRect(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getX2());
                //}
                if (figures.get(i) instanceof Cercle) {
                    g.setColor(figures.get(i).getColor());
                    g.drawOval(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getX2());
                }
                if (figures.get(i) instanceof CerclePlein) {
                    g.setColor(figures.get(i).getColor());
                    g.fillOval(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getX2());
                }
                if (figures.get(i) instanceof Ellipse) {
                    g.setColor(figures.get(i).getColor());
                    g.drawOval(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getY2());
                }
                if (figures.get(i) instanceof EllipsePlein) {
                    g.setColor(figures.get(i).getColor());
                    g.fillOval(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getY2());
                }
                if (figures.get(i) instanceof Segment) {
                    g.setColor(figures.get(i).getColor());
                    g.drawLine(figures.get(i).getX1(), figures.get(i).getY1(), figures.get(i).getX2(), figures.get(i).getY2());
                }
                if (figures.get(i) instanceof Triangle) {
                    Triangle trg=(Triangle)figures.get(i);
                    g.setColor(trg.getColor());
                    if (trg.getTest(0)==true && trg.getTest(1)==true && trg.getTest(2)==true)
                    g.drawPolygon(trg.getTabX(), trg.getTabY(), 3);
                }
                if (figures.get(i) instanceof TrianglePlein) {
                    Triangle trg=(Triangle)figures.get(i);
                    g.setColor(trg.getColor());
                    if (trg.getTest(0)==true && trg.getTest(1)==true && trg.getTest(2)==true)
                        g.fillPolygon(trg.getTabX(), trg.getTabY(), 3);
                }

                if (figures.get(i) instanceof Texte) {
                     Texte tex=(Texte)figures.get(i);
                     g.drawString(tex.getTxt(), tex.getX(), tex.getY());
                }
                //if (figures.size()!=0) {
                //    if (figures.get(i) instanceof Gomme) {
                //        Gomme gomme = (Gomme) figures.get(figures.size() - 1);
                //        // System.out.println(gomme.getX()+","+gomme.getY());
                //        System.out.println(figures.size());
                //        for (int k = figures.size() - 2; k >= 0; k--) {
                //            Figure forme = figures.get(k);
                //            if (!(forme instanceof Triangle))
                //                System.out.println(forme.appartient(gomme));
//
                //                if (forme.appartient(gomme)) {
                //                    figures.remove(k);
                //                    figures.remove(figures.size() - 1);
                //                    k = -1;
                //                }
                //            //else{
                //            //    if (gomme.getX()>=forme.getX1() && gomme.getY()>=forme.getY1() && gomme.getX()<=(forme.getX2()-forme.getX1()) && gomme.getY()<=(forme.getY2()-forme.getY1())){
                //            //        figures.remove(k);
                //            //        figures.remove(figures.size()-1);
                //            //    }
                //            //}
                //        }
                //        repaint();
                repaint();
                //}
            }
        }
        catch(Exception ex){
        }
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }
}