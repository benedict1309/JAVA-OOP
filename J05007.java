package javacuason;
import java.util.*;
class NhanVien implements Comparable<NhanVien>{
    String ma,name,sex,birth,add,id,sd;
    public NhanVien(String a, String b, String c, String d, String e, String f,int i){
        ma = String.format("%05d", i);
        name = a;
        sex = b;
        birth = c;
        add = d;
        id = e;
        sd = f;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+sex+" "+birth+" "+add+" "+id+" "+sd;
    }
    @Override
    public int compareTo(NhanVien o){
        int y1 = Integer.parseInt(this.birth.substring(6));
        int y2 = Integer.parseInt(o.birth.substring(6));
        int m1 = Integer.parseInt(this.birth.substring(3,5));
        int m2 = Integer.parseInt(o.birth.substring(3,5));
        int d1 = Integer.parseInt(this.birth.substring(0,2));
        int d2 = Integer.parseInt(o.birth.substring(0,2));
        if(y1==y2){
            if(m1==m2){
                return Integer.compare(d1, d2); 
            }
            return Integer.compare(m1,m2);
        }
        return Integer.compare(y1,y2);
    }
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            String f = sc.nextLine();
            NhanVien nv = new NhanVien(a,b,c,d,e,f,i+1);
            list.add(nv);
        }
        Collections.sort(list);
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
}
