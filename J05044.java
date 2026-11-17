/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;

public class J05044 {
    static class NhanVien{
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
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<NhanVien,String> list = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            long c = Long.parseLong(sc.nextLine());
            long d = Long.parseLong(sc.nextLine());
            NhanVien nv = new NhanVien(i,a,b,c,d);
            list.put(nv,b);
        }
        String ss = sc.nextLine();
        for(Map.Entry<NhanVien,String> x : list.entrySet()){
            if(x.getValue().equals(ss)){
                System.out.println(x.getKey());
            }
        }
    }
}
