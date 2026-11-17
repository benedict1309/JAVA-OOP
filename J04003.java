package javacuason;
import java.util.*;
import static java.lang.Math.*;
public class J04003 {
   static class Phanso{
       long tu,mau;
       public Phanso(long tu, long mau){
           this.tu = tu;
           this.mau = mau;
       }
       public long ucln(Phanso a){
           while(a.mau!=0)
           {
               long tmp = a.tu;
               a.tu = a.mau;
               a.mau = tmp%a.mau;
           }
           return a.tu;
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Phanso p = new Phanso(a,b);
        long gcd = p.ucln(p);
        System.out.printf("%d/%d",a/gcd,b/gcd);
    }
}
