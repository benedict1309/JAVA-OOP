package javacuason;
import java.util.*;
import static java.lang.Math.*;
public class J04001 {
    static class Point{
        double x,y;
        public Point(){
            this.x = 0;
            this.y = 0;
        }
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public Point(Point p){
            this.x = p.x;
            this.y = p.y;
        }
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double distance(Point other){
            return sqrt(pow(this.x-other.x,2)+pow(this.y-other.y,2));
        }
        public double distance(Point a, Point b){
            return sqrt(pow(a.x-b.x,2)+pow(a.y-b.y,2));
        }
        @Override
        public String toString()
        {
            return x+" "+y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x,y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x,y);
            System.out.printf("%.4f\n",a.distance(b));
        }
    }
}
