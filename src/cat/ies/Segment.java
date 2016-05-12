package cat.ies;

public class Segment {
    protected Punt p0;
    protected Punt p1;

    public Segment(Segment s) {
        p0 = new Punt(s.getPunt0());
        p1 = new Punt(s.getPunt1());
    }

    public Segment(Punt p0, Punt p1) {
        this.p0 = new Punt(p0);
        this.p1 = new Punt(p1);
    }

    public Segment(int x0, int y0, int x1, int y1) {
        this.p0 = new Punt(x0, y0);
        this.p1 = new Punt(x1, y1);
    }

    public Punt getPunt0() {
        return p0;
    }

    public Punt getPunt1() {
        return p1;
    }

    public String toString() {
        String str;
        str = "(" + p0.toString() + p1.toString() + ")";
        return str;
    }
}
