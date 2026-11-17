/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
/**
 *
 * @author luuth
 */
class SinhVien{
    String ma,name,lop,birth;
    double gpa;
    public SinhVien(String name,String lop,String birth,double gpa,int i){
        this.ma = String.format("B20DCCN%03d", i);
        this.name = chuanhoa(name);
        this.lop = lop;
        this.birth = normalize(birth);
        this.gpa = gpa;
    }
    private String chuanhoa(String s){
       String[] words = s.trim().toLowerCase().split("\\s+");
       String ten = "";
       for(String w : words)
       {
           ten += Character.toUpperCase(w.charAt(0))+w.substring(1) + " ";
       }
       return ten.trim();
    }
    private String normalize(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0,'0');
        if(sb.charAt(4)=='/') sb.insert(3, '0');
        return sb.toString();
    }
    public void in(){
        System.out.printf("%s %s %s %s %.2f\n",ma,name,lop,birth,gpa);
    }
}
public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien[] list = new SinhVien[n+1];
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            list[i] = new SinhVien(a,b,c,d,i);
            list[i].in();
        }
    }
}
