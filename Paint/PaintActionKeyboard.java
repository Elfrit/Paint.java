import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class PaintActionKeyboard implements KeyListener{
    private Paint fen;
    private Color chooser;
    public PaintActionKeyboard(Paint fen) {
        super();
        this.fen=fen;
        //this.fig=((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figu;
        //this.arr=((Paint)((JComponent)e.getSource()).getTopLevelAncestor()).figures;
    }

    public void keyPressed(KeyEvent k){
        if ((k.getModifiers()==KeyEvent.CTRL_MASK)){
            switch(k.getKeyCode()){
                case (KeyEvent.VK_R):
                    ((Paint)k.getSource()).figu=new RectanglePlein(0,0,0,0);
                    break;
               case (KeyEvent.VK_C):
                   ((Paint)k.getSource()).figu = new CerclePlein(0,0,0,0);
                   break;
               case (KeyEvent.VK_T):
                   int[] tab = {0,0,0};
                   int[] tab_bis = {0,0,0};
                   ((Paint)k.getSource()).figu  = new TrianglePlein(tab, tab_bis, 3);
                   break;
               case (KeyEvent.VK_E):
                   ((Paint)k.getSource()).figu = new EllipsePlein(0,0,0,0);
                   break;
            }
        }

        else if ((k.getModifiers()==KeyEvent.SHIFT_MASK)){
            switch(k.getKeyCode()){
                case (KeyEvent.VK_C):
                    //System.out.println((Figure)((Paint)k.getSource()).figu); // 1er marche avec 1 et 0
                    if (((Paint)k.getSource()).figu==null)
                        JOptionPane.showMessageDialog(null, "Choisir une figure avant tout changement de couleur.");
                    else {
                        Color initialcolor = Color.BLACK;
                        chooser = JColorChooser.showDialog(fen, "Select a color", initialcolor);
                        ((Figure) ((Paint) k.getSource()).figu).setColor(chooser);
                    }
                    break;
                case (KeyEvent.VK_G):
                    ((Paint)k.getSource()).figu = new Gomme(0,0);
                    break;
            }
        }
        else if ((k.getModifiers()!=KeyEvent.CTRL_MASK)){
            switch(k.getKeyCode()) {
                case (KeyEvent.VK_R):
                    ((Paint)k.getSource()).figu = new Rectangle(0, 0, 0, 0);
                    break;

                case (KeyEvent.VK_C):
                    ((Paint)k.getSource()).figu = new Cercle(0, 0, 0, 0);
                    break;

                case (KeyEvent.VK_T):
                    int[] tab = {0, 0, 0};
                    int[] tab_bis = {0, 0, 0};
                    ((Paint)k.getSource()).figu  = new Triangle(tab, tab_bis, 3);
                    break;

                case (KeyEvent.VK_E):
                    ((Paint)k.getSource()).figu  = new Ellipse(0, 0, 0, 0);
                    break;

                case (KeyEvent.VK_S):
                    ((Paint)k.getSource()).figu  = new Segment(0, 0, 0, 0);
                    break;
                case (KeyEvent.VK_M):
                    System.out.println("j'affiche moi");
                    //((JTextArea)((JPanel)((JPanel)((JTabbedPane)((JPanel)((JPanel)((Paint)k.getSource()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(1)).getComponent(1)).getComponent(0)).getText();
                    //System.out.println(((JTextArea)((JPanel)((JPanel)((JTabbedPane)((JPanel)((JPanel)((Paint)k.getSource()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(1)).getComponent(1)).getComponent(0)).getText());
                    //((Paint)k.getSource())
                    String txt =((JTextArea)((JPanel)((JPanel)((JTabbedPane)((JPanel)((JPanel)((Paint)k.getSource()).getContentPane()).getComponent(1)).getComponent(0)).getComponent(1)).getComponent(1)).getComponent(0)).getText();

                    ((Paint)k.getSource()).figu  = new Texte(txt ,0, 0);
                    break;
            }
        }
    }
    public void keyReleased(KeyEvent k){}
    public void keyTyped(KeyEvent k){}
}
