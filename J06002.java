/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
class Pro{
    String ma,ten;
    long cost;
    public Pro(String ma,String ten,long cost){
        this.ma = ma;
        this.ten = ten;
        this.cost = cost;
    }
}
class Bill implements Comparable<Bill>{
    String ma,hd,net;
    long gg,pt;
    private long getSale(long s,long ss){
        if(s >= 150) return s*ss*50/100;
        if(s >= 100) return  s*ss*30/100;
        if(s >= 50) return s*ss*15/100;
        return 0;
    }
    public Bill(String ma,String hd,long solg,Pro pro){
        this.ma = ma;
        this.hd = hd;
        this.net = pro.ten;
        this.gg = getSale(solg,pro.cost);
        this.pt = solg*pro.cost-this.gg;
    }
    @Override
    public int compareTo(Bill o){
        return Long.compare(o.pt,this.pt);
    }
    @Override
    public String toString(){
        return ma+"-"+hd+" "+net+" "+gg+" "+pt;
    }
}
public class J06002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pro> list = new ArrayList<>();
        while(n-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            for(int i=1;i<=2;i++)
            {
                long c = Long.parseLong(sc.nextLine());
                Pro pro = new Pro(a+String.valueOf(i),b,c);
                list.add(pro);
            }
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Bill> llib = new ArrayList<>();
        for(int i=1;i<=m;i++)
        {
            String e = sc.next();
            long f = sc.nextLong();
            for(Pro x : list){
                if(x.ma.equals(e)){
                    Bill bill = new Bill(e,String.format("%03d", i),f,x);
                    llib.add(bill);
                }
            }
        }
        Collections.sort(llib);
        for(Bill x : llib){
            System.out.println(x);
        }
    }
}
