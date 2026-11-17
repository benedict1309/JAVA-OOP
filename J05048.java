/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
public class J05048 {
    static class Pro {
        String ma;
        long nhap,xuat,gia,tien,thue;
        public Pro(String a,long b){
            ma = a;
            nhap = b;
            xuat = getxuat(a.charAt(0),b);
            gia = getgia(a.charAt(a.length()-1));
            tien = xuat*gia;
            thue = getthue(a.charAt(0),a.charAt(a.length()-1));
        }
        private long getxuat(char a, long b){
            if(a == 'A') return Math.round((double)b*60/100);
            return Math.round((double)b*70/100);
        }
        private long getgia(char a){
            if(a=='Y') return 110000;
            return 135000;
        }
        private long getthue(char a, char b){
            if(a=='A'&&b=='Y') return tien*8/100;
            if(a=='A'&&b=='N') return tien*11/100;
            if(a=='B'&&b=='Y') return tien*17/100;
            return tien*22/100;
        }
        @Override
        public String toString(){
            return ma+" "+nhap+" "+xuat+" "+gia+" "+tien+" "+thue;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
         List<Pro> list = new ArrayList<>();
         for(int i=1;i<=n;i++){
             String a = sc.nextLine();
             long b = Long.parseLong(sc.nextLine());
             Pro c = new Pro(a, b);
             list.add(c);
         }
        for (Pro pro : list) {
            System.out.println(pro);
        }
    }
}
