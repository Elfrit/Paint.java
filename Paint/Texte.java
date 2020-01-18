public class Texte extends Figure{
    private String txt;
    private int x;
    private int y;

    public Texte(String txt, int x, int y){
        this.txt=txt;
        this.x=x;
        this.y=y;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTxt() {
        return txt;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean appartientTxt(Gomme g){
        if((g.getX()>=(this.getX()) && g.getY()>=(this.getY()) && g.getX()<=(this.getX()+(this.getTxt()).length()+this.getX()) && g.getY()<=(this.getY()+this.getY())))
            return true;
        return false;
    }

}