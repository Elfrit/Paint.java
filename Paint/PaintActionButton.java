import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class PaintActionButton implements ActionListener{
   // private Figure fig;

    public PaintActionButton(){
        super();
 //       this.fig=fig;
    }

    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getSource());
       // e.getSource().getTopLevelAncestor();
        ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Rectangle(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="Rectangle")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Rectangle(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="RectanglePlein")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new RectanglePlein(0,0,0,0);
        //if (((JButton)e.getSource()).getText()=="Carre")
        //    ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Carre(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="Cercle")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Cercle(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="CerclePlein")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new CerclePlein(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="Ellipse")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Ellipse(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="Ellipse")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Ellipse(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="Segment")
            ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Segment(0,0,0,0);
        if (((JButton)e.getSource()).getText()=="Triangle") {
            int[] tab = {0, 0, 0};
            int[] tab_bis = {0, 0, 0};
            ((Paint) ((JComponent) e.getSource()).getTopLevelAncestor()).figu = new Triangle(tab, tab_bis, 3);
        }
        //System.out.println(e.getSource().getTopLevelAncestor().figu);
       // fig = new Rectangle(0,0,0,0);
        //System.out.println(((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu);
    }
}