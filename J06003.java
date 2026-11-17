package javacuason;
import java.util.*;
public class J06003 {
    static class SinhVien{
        String ma,name,sdt;
        public SinhVien(String ma,String name,String sdt){
            this.ma = ma;
            this.name = name;
            this.sdt = sdt;
        }
        public String toString(){
            return ma+ " "+name+" "+sdt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<SinhVien,Integer> sinhvien = new LinkedHashMap<>();
        while(n-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = Integer.parseInt(sc.nextLine());
            SinhVien sv = new SinhVien(a,b,c);
            sinhvien.put(sv,d);
        }
        HashMap<Integer,String> baitap = new HashMap<>();
        for(int i=1; i <= m;i++){
            String e = sc.nextLine();
            baitap.put(i,e);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            int orderNum = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM "+ orderNum +":");
            for(Map.Entry<SinhVien,Integer> x : sinhvien.entrySet()){
                if(x.getValue()==orderNum){
                    System.out.println(x.getKey());
                }
            }
            System.out.println("Bai tap dang ky: " + baitap.get(orderNum));
        }
    }
}
