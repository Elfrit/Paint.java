import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.IOException;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	public Fenetre(String titre, int w, int h) throws Exception {
		super(titre);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		JPanel pN = new JPanel();
		this.add(pN, BorderLayout.NORTH);

		JPanel pC = new JPanel();
		this.add(pC, BorderLayout.CENTER);
		pC.setLayout(new BorderLayout());

		Rectangle2 p3=new Rectangle2(); //La figure présente dans une autre classe
		pC.add(p3);

		this.setSize(w, h);
		this.setVisible(true);
	}

	public static void main(String[] arg) throws Exception {
		new Fenetre("Paint", 600, 400);
	}
}
