/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
class NhanVien{
    String ma,ten;
    long pc,lc,tu,cl;
    private long phucap(String s){
        if(s.equals("GD")) return 500;
        if(s.equals("PGD")) return 400;
        if(s.equals("TP")) return 300;
        if(s.equals("KT")) return 250;
        return 100;
    }
    private long xuly(long s){
        if((double)s*2/3<25000.0){
            return Math.round(s*2/3/1000.0)*1000;
        }
        return 25000;
    }
    public NhanVien(String a, String b, long c, long d, int i){
        ma = String.format("NV%02d", i);
        ten = a;
        pc = phucap(b);
        lc = c*d;
        tu = xuly(pc+lc);
        cl = pc+lc-tu;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+pc+" "+lc+" "+tu+" "+cl;
    }
}
public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> nv = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            long c = Long.parseLong(sc.nextLine());
            long d = Long.parseLong(sc.nextLine());
            NhanVien vn = new NhanVien(a,b,c,d,i);
            nv.add(vn);
        }
        for(NhanVien x : nv){
            System.out.println(x);
        }
    }
}
