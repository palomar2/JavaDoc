package cat.ies;

public class Poligon {
    protected Segment [] segments;
    protected int num_segments;
    protected int max_segments;

    public Poligon(int num_segments) {
        max_segments = num_segments;
        segments = new Segment [max_segments];
    }

    public void addSegment(Segment s) {
        if (num_segments < max_segments) {
            segments[num_segments] = new Segment(s);
            num_segments++;
        }
    }

    public void addSegment(int x0, int y0, int x1, int y1) {
        /*
        Punt p0 = new Punt(x0, y0);
        Punt p1 = new Punt(x1, y1);
        Segment s = new Segment(p0, p1);
        */

        Segment s = new Segment(x0, y0, x1, y1);
        addSegment(s);
    }

    public String toString() {
        String str = new String("");
        for (int i=0; i<num_segments; i++) {
            str += segments[i].toString() + "\n";
        }
        return str;
    }
}
