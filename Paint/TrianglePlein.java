import java.awt.Color;

public class TrianglePlein extends Triangle{
    protected int[] tab_x = {0, 0, 0};
    protected int[] tab_y = {0, 0, 0};
    protected int w;
    private boolean[] test = {false, false, false};
    private Color color;


    public TrianglePlein(int[] x, int[] y, int w) {
        this.tab_x = x;
        this.tab_y = y;
        this.w = w;
    }

    public void setX(int i, int x) {
        this.tab_x[i] = x;
    }

    public void setY(int i, int y) {
        this.tab_y[i] = y;
    }

    public int[] getTabX() {
        return tab_x;
    }

    public int[] getTabY() {
        return tab_y;
    }

    public String getTab(){
        return ("X= "+this.tab_x[0]+","+this.tab_x[1]+","+this.tab_x[2]+"\nY= "+this.tab_y[0]+","+this.tab_y[1]+","+this.tab_y[2]);
    }

    public boolean getTest(int i) {
        return test[i];
    }

    public void setTest(int i, boolean test) {
        this.test[i] = test;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

