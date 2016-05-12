package cat.ies;

public class Punt {
    protected int x;
    protected int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punt(Punt p) {
        x = p.getX();
        y = p.getY();
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
