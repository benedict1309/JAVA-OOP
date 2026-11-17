package javacuason;
import java.util.*;
public class J04008 {
    static class Point{
        double x,y;
        public Point(double x,double y){
            this.x = x;
            this.y = y;
        }
        public Point p(Point a){
            return new Point(a.x,a.y);
        }
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double distance(Point other){
            return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
        }
        public double distance(Point p1, Point p2){
            return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
        }
        @Override
        public String toString(){
            return x+" "+y;
        }
    }
    static class Triangle{
        Point a,b,c;
        public Triangle(Point a,Point b, Point c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public void in()
        {
            double canh1,canh2,canh3;
            canh1 = a.distance(b);
            canh2 = b.distance(c);
            canh3 = c.distance(a);
            if ((canh1 + canh2 <= canh3 ) || (canh2 + canh3 <= canh1) || (canh3 + canh1 <= canh2))
            {
                System.out.println("INVALID");
            }else{
                System.out.printf("%.3f\n", canh1+canh2+canh3);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Triangle[] list = new Triangle[t];
        for(int i=0;i<t;i++)
        {
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            list[i] = new Triangle(a,b,c);
        }
        for(int i=0;i<t;i++)
        {
            list[i].in();
        }
    }
}
