package javacuason;
import java.util.*;

public class J04013 {
    static class ThiSinh{
        String ma, name;
        double toan, ly, hoa;
        public ThiSinh(String ma, String name, double toan, double ly, double hoa){
            this.ma = ma;
            this.name = name;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }
        public double diemuutien(){
            StringBuilder sb = new StringBuilder(this.ma);
            if(sb.substring(0,3).equals("KV1")) return 0.5;
            if(sb.substring(0,3).equals("KV2")) return 1.0;
            return 2.5;
        }
        public double tongdiem(){
            return this.toan * 2 + this.hoa + this.ly;  
        }
        public String xettuyen(){
            return this.diemuutien() + this.tongdiem() >= 24 ? "TRUNG TUYEN" : "TRUOT";
        }
        public String quydoi(double diem){
            if(diem == (int)diem){
                return String.valueOf((int)diem);
            }
            return String.format(Locale.US, "%.1f", diem); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        
        ThiSinh ts = new ThiSinh(a, b, c, d, e);
        System.out.printf("%s %s %s %s %s\n", ts.ma, ts.name, ts.quydoi(ts.diemuutien()), ts.quydoi(ts.tongdiem()), ts.xettuyen());
    }
}