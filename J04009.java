package javacuason;
import java.util.*;

public class J04009 {
    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point other) {
            return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }
    }

    static class Triangle {
        Point a, b, c;

        public Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void in() {
            double c1 = a.distance(b);
            double c2 = b.distance(c);
            double c3 = c.distance(a);
            double maxSide = Math.max(c1, Math.max(c2, c3));
            if (2 * maxSide >= c1 + c2 + c3) {
                System.out.println("INVALID");
            } else {
                double s = Math.sqrt((c1 + c2 + c3) * (c1 + c2 - c3) * (c2 + c3 - c1) * (c3 + c1 - c2)) / 4.0;
                System.out.printf(Locale.US,"%.2f\n", s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        Triangle[] list = new Triangle[t];
        for (int i = 0; i < t; i++) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            list[i] = new Triangle(a, b, c);
        }
        for (int i = 0; i < t; i++) {
            list[i].in();
        }
        sc.close();
    }
}