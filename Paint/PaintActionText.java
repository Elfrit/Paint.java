import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class PaintActionText implements ActionListener{

    public PaintActionText(){
        super();
    }

    public void actionPerformed(ActionEvent e){
        JButton btn =(JButton) e.getSource();
        String txt = ((JTextArea)((JPanel)((JPanel)((JTabbedPane)((JPanel)((JPanel)((JFrame)btn.getTopLevelAncestor()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(1)).getComponent(1)).getComponent(0)).getText();
        //System.out.println(((JTextArea)((JPanel)((JPanel)((JTabbedPane)((JPanel)((JPanel)((JFrame)btn.getTopLevelAncestor()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(1)).getComponent(1)).getComponent(0)));
        System.out.println(txt);
        ((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu=new Texte(txt,0,0);


    }


}