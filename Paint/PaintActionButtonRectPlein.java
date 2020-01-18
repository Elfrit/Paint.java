import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class PaintActionButtonRectPlein implements ActionListener{
    // private Figure fig;

    public PaintActionButtonRectPlein(){
        super();
        //       this.fig=fig;
    }

    public void actionPerformed(ActionEvent e) {
        ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new RectanglePlein(0,0,0,0);
        System.out.println(((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu);
    }


}