package cat.ies;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanin = new Scanner(System.in);

        System.out.println("Entra número de costats:");
        int num_costats = scanin.nextInt();

        Poligon p = new Poligon(num_costats);

        for (int i=0; i<num_costats; i++) {
            System.out.println("** Segment " + i);
            System.out.println(" * Primer punt");
            System.out.println("X:");
            int x0 = scanin.nextInt();
            System.out.println("Y:");
            int y0 = scanin.nextInt();
            System.out.println(" * Segon punt");
            System.out.println("X:");
            int x1 = scanin.nextInt();
            System.out.println("Y:");
            int y1 = scanin.nextInt();
            p.addSegment(x0, y0, x1, y1);
        }

        System.out.println(p.toString());
    }
}
