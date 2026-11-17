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
class Pro implements Comparable<Pro>{
    int stt;
    String name,ca;
    double in;
    public Pro(int stt,String name, String ca,double in){
        this.stt = stt;
        this.name = name;
        this.ca = ca;
        this.in = in;
    }
    @Override
    public int compareTo(Pro o){
        return Double.compare(o.in, this.in);
    }
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pro> list = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            Double c = Double.parseDouble(sc.nextLine());
            Double d = Double.parseDouble(sc.nextLine());
            Pro pro = new Pro(i,a,b,d-c);
            list.add(pro);
        }
        Collections.sort(list);
        for(Pro x : list){
            System.out.printf("%d %s %s %.2f\n",x.stt,x.name,x.ca,x.in);
        }
    }
}
