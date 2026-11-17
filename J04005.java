package javacuason;
import java.util.*;
public class J04005 {
    static class Thisinh{
        String name,birth;
        double d1,d2,d3,tong;
        public Thisinh(String name, String birth, double d1, double d2, double d3){
            this.name = name;
            this.birth = birth;
            this.tong = d1+d2+d3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        Thisinh f = new Thisinh(a,b,c,d,e);
        System.out.printf("%s %s %.1f",f.name,f.birth,f.tong);
    }
}
