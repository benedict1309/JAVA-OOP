/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;

public class J05045 {
    static class NhanVien implements Comparable<NhanVien>{
    String ma,name;
    long phucap,luongchinh,tamung,conlai;
    public NhanVien(int i,String name,String phucap,long luong,long ngay){
        this.ma = String.format("NV%02d", i);
        this.name = name;
        this.phucap = getPhuCap(phucap);
        this.luongchinh = luong*ngay;
        this.tamung = gettamung(this.phucap+luongchinh);
        this.conlai = luongchinh + this.phucap - tamung;
    }
    private long gettamung(long s){
        if((double)s*2/3<25000.0){
            return Math.round(s*2/3/1000.0)*1000;
        }
        return 25000;
    }
    private long getPhuCap(String s){
        if(s.equals("GD")) return 500;
        if(s.equals("PGD")) return 400;
        if(s.equals("TP")) return 300;
        if(s.equals("KT")) return 250;
        return 100;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+phucap+" "+luongchinh+" "+tamung+" "+conlai;
    }
    @Override
    public int compareTo(NhanVien o){
        if(this.luongchinh+this.phucap==o.phucap+o.luongchinh){
            int a = Integer.parseInt(this.ma.substring(2));
            int b = Integer.parseInt(o.ma.substring(2));
            return Integer.compare(a, b);
        }
        return Long.compare(o.luongchinh+o.phucap,this.luongchinh+this.phucap);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            long c = Long.parseLong(sc.nextLine());
            long d = Long.parseLong(sc.nextLine());
            NhanVien nv = new NhanVien(i,a,b,c,d);
            list.add(nv);
        }
        Collections.sort(list);
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
}
