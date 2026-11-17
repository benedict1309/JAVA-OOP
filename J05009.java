/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;        


class ThiSinh{
    int stt;
    String name,birth;
    double diem;
    public ThiSinh(int stt, String name, String birth, double diem){
        this.stt = stt;
        this.name = name;
        this.birth = birth;
        this.diem = diem;
    }
    @Override
    public String toString(){
        return stt+" "+name+" "+birth+" "+diem;
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        double maxi = -1e6;
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            double c = Double.parseDouble(sc.nextLine());
            double d = Double.parseDouble(sc.nextLine());
            double e = Double.parseDouble(sc.nextLine());
            maxi = Double.max(c+d+e,maxi);
            ThiSinh ts = new ThiSinh(i,a,b,c+d+e);
            list.add(ts);
        }
        for(ThiSinh x : list){
            if(x.diem == maxi){
                System.out.println(x);
            }
        }
    }
}
