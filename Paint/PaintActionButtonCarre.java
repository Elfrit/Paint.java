import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class PaintActionButtonCarre implements ActionListener{
    // private Figure fig;

    public PaintActionButtonCarre(){
        super();
        //       this.fig=fig;
    }

    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getSource());
        // e.getSource().getTopLevelAncestor();
        ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Carre(0,0,0,0);
        //System.out.println(e.getSource().getTopLevelAncestor().figu);
        // fig = new Rectangle(0,0,0,0);
        System.out.println(((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu);
    }


}