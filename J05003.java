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
    static int cnt = 0;
    public SinhVien(String name,String lop,String birth,double gpa){
        cnt++;
        this.ma = String.format("B20DCCN%03d", cnt);
        this.name = name;
        this.lop = lop;
        this.birth = normalize(birth);
        this.gpa = gpa;
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
public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] list = new SinhVien[n+1];
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            list[i] = new SinhVien(a,b,c,d);
            list[i].in();
        }
    }
}
