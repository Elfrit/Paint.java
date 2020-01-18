import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Graphics;

public class PaintActionTab implements ChangeListener{
    private Paint fen;
    public PaintActionTab(Paint fen){
        super();
        this.fen=fen;
    }

    public void stateChanged(ChangeEvent ak){
        fen.requestFocus();
        //System.out.println(tp.getSelectedIndex());

    }
}