yguimport java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class PaintActionSave implements ActionListener{

    private Paint fen;
    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public PaintActionSave(Paint fen, ArrayList<Figure> fig){
        super();
        this.figures=fig;
        this.fen=fen;
    }

    public void actionPerformed(ActionEvent e){
        try {
            //System.out.println(((Paint)((JButton)e.getSource()).getTopLevelAncestor()).figures.size());
            //System.out.println(((PaintView)((JTabbedPane)((JPanel)((JPanel)((Paint)((JButton)e.getSource()).getTopLevelAncestor()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(0)).figures=figuress);
            if (((JButton) (e.getSource())).getText() == "Save") {
                FileOutputStream f = new FileOutputStream(new File("Figures.txt"));
                ObjectOutputStream o = new ObjectOutputStream(f);
                o.writeObject(figures);

                o.close();
                f.close();
            }
            else{
                FileInputStream fi = new FileInputStream(new File("Figures.txt"));
                ObjectInputStream oi = new ObjectInputStream(fi);

                ArrayList<Figure> figuress=(ArrayList) oi.readObject();

                oi.close();
                fi.close();
                ((Paint)((JButton)e.getSource()).getTopLevelAncestor()).figures=figuress;
                //System.out.println(((Paint)((JButton)e.getSource()).getTopLevelAncestor()).figures.size());
                ((Paint)((JButton)e.getSource()).getTopLevelAncestor()).figures=figuress;
                ((PaintView)((JTabbedPane)((JPanel)((JPanel)((Paint)((JButton)e.getSource()).getTopLevelAncestor()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(0)).setFigures(figuress);


            }
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch(IOException ex){
            System.out.println("Error initializing stream");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        fen.requestFocus();
    }
}
