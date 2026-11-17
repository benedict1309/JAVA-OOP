package javacuason;
import java.util.*;
class NhanVien{
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
}
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<Integer,NhanVien> list = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            String f = sc.nextLine();
            NhanVien nv = new NhanVien(a,b,c,d,e,f,i+1);
            list.put(i+1, nv);
        }
        for(Map.Entry<Integer,NhanVien> x : list.entrySet()){
            System.out.println(x.getValue());
        }
    }
}
