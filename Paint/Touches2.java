import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.InputEvent;

class Indication extends JPanel {
    int h;
    Indication() {
	int hauteur, largeur;
	Font font = new Font("TimesRoman", Font.BOLD|Font.ITALIC,14);
	FontMetrics ft = getFontMetrics(font);
	h = ft.getHeight();
	largeur = ft.stringWidth
	    ("bouton gauche + b pour voir un  disque bleu     ");
	setPreferredSize(new Dimension(largeur, 6*h + 25));
	setFont(font);	
    }

    public void paintComponent(Graphics g) {
	int x = 10, y = 40;
	
	g.drawString(" r pour voir un cercle rouge", x, y);
	y += h;
	g.drawString(" CTRL + r pour voir un disque rouge", x, y);
	y += h;
	g.drawString(" b pour voir un cercle bleu", x, y);
	y += h;
	g.drawString(" bouton droit + b pour voir un  disque bleu", x, y);
	y += h;
	g.drawString(" barre d'espace pour descendre le cercle", x, y);
	y += h;
	g.drawString(" touche \"arriere\"  pour repositionner le cercle", x, y);
    }
}

class Ardoise extends JPanel {
    private Color couleur = Color.BLUE;
    private boolean plein = false;
    private int hauteur = 20;
    
    Ardoise() {
	setPreferredSize(new Dimension(250, 200)); 
    }
    
    public void paintComponent(Graphics g) {
	int largeur = getSize().width;
	
	super.paintComponent(g);
	g.setColor(couleur);
	if (plein) g.fillOval((largeur - 100)/2, hauteur, 100, 100);
	else g.drawOval((largeur - 100)/2, hauteur, 100, 100);
    }
    void setCouleur(Color couleur) {
	this.couleur = couleur;
	repaint();
    }

    void setPlein(boolean valeur) {
	plein = valeur;
	repaint();
    }

    void setHauteur(int valeur) {
	hauteur = valeur;
	repaint();
    }
}

public class Touches2 extends JFrame implements KeyListener {
    Ardoise ardoise = new Ardoise();
    Touches2() {
	super("Essai des touches");
	add(new Indication(), BorderLayout.NORTH);
	add(ardoise, BorderLayout.CENTER);
	addKeyListener(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	addWindowListener(new WindowAdapter() {
		public void windowOpened(WindowEvent e) { 		       
		    requestFocus();	
		}
	    });
	pack();
	setVisible(true);
    }
    
    public void keyPressed(KeyEvent evt) {
	int code = evt.getKeyCode();
	
	if (code ==  KeyEvent.VK_R) {
	    ardoise.setCouleur(Color.RED);
	    if (evt.isControlDown()) ardoise.setPlein(true);
	    else ardoise.setPlein(false);
	}
	else if (code == KeyEvent.VK_B) {
	    ardoise.setCouleur(Color.BLUE);
	    if ((evt.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0) ardoise.setPlein(true);
	    else ardoise.setPlein(false);
	}
	else if (code == KeyEvent.VK_SPACE) ardoise.setHauteur(80);
	else if (code == KeyEvent.VK_BACK_SPACE) ardoise.setHauteur(20);
    }
    
    public void keyTyped(KeyEvent evt) {}
    public void keyReleased(KeyEvent evt) {}
}

class EssaiTouches2 {
    public static void main(String[] arg) {
	new Touches2();
    }
}
