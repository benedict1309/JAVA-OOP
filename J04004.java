package javacuason;
import java.util.*;
public class J04004 {
    static class Phanso{
        long tu,mau;
        public Phanso(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        private long gcd(long a, long b){
            while(b!=0)
            {
                long tmp = a;
                a = b;
                b = tmp%a;
            }
            return a;
        }
        private long lcm(long a, long b){
            return (a*b)/gcd(a,b);
        }
        public Phanso CongPhanSo(Phanso other){
            long x = this.mau;
            long y = other.mau;
            long msc = lcm(x,y);
            long tumoi = this.tu*(msc/this.mau)+other.tu*(msc/other.mau);
            long maumoi = msc;
            long ucln = gcd(tumoi,maumoi);
            return new Phanso(tumoi/ucln,maumoi/ucln);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        Phanso a = new Phanso(x,y);
        x = sc.nextLong();
        y = sc.nextLong();
        Phanso b = new Phanso(x,y);
        System.out.printf("%d/%d", a.CongPhanSo(b).tu,a.CongPhanSo(b).mau);
    }
}
