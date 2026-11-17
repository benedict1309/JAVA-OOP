package javacuason;
import java.util.*;
public class J04012 {
    static class NhanVien{
        String ma,name;
        long sal,days;
        String pos;
        static long cnt = 0;
        public NhanVien(String name,long sal,long days,String pos){
            cnt++;
            this.ma = String.format("NV%02d", cnt);
            this.name = name;
            this.sal = sal;
            this.days = days;
            this.pos = pos;
        }
        public long tienluong(){
            return this.days*this.sal;
        }
        public long tienthuong(){
            if(this.days>=25) return this.tienluong()*20/100;
            else if(this.days>=22 && this.days<=24) return this.tienluong()*10/100;
            return 0;
        }
        public long phucap(){
            if(this.pos.equals("GD")) return 250000;
            if(this.pos.equals("PGD")) return 200000;
            if(this.pos.equals("TP")) return 180000;
            return 150000;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        long b = sc.nextLong();
        long c = sc.nextLong();
        String d = sc.next();
        NhanVien nv = new NhanVien(a,b,c,d);
        long income = nv.tienluong()+nv.tienthuong()+nv.phucap();
        System.out.printf("%s %s %d %d %d %d",nv.ma,nv.name,nv.tienluong(),nv.tienthuong(),nv.phucap(),income);
    }
}
