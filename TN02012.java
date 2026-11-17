package javacuason;
import java.util.*;
public class TN02012 {
    static class NhanVien{
        String ma,name,ban;
        long luong;
        private static final int[][] heso={
                {10,12,14,20},{10,11,13,16},{9,10,12,14},{8,9,11,13}
        };
        public NhanVien(String ma,String name,String ban,long luong){
            this.ma = ma;
            this.name = name;
            this.ban = ban;
            this.luong = luong*getheso();
        }
        private int getheso(){
            int row = ma.charAt(0)-'A';
            int col = 0;
            if(Integer.parseInt(ma.substring(1,3))>=16) col=3;
            else if(Integer.parseInt(ma.substring(1,3))>=9) col = 2;
            else if(Integer.parseInt(ma.substring(1,3))>=4) col = 1;
            else col = 0;
            return heso[row][col];
        }
        @Override
        public String toString(){
            return ma+" "+name+" "+ban+" "+luong;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String,String> department = new HashMap<>();
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String s = a.substring(0, 2);
            String ss = a.substring(2).trim();
            department.put(s,ss);
        }
        List<NhanVien> nhanvien = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=m;i++){
            String b = sc.nextLine();
            String c = sc.nextLine();
            long d = Long.parseLong(sc.nextLine())*1000;
            long e = Long.parseLong(sc.nextLine());
            String f = b.substring(3);
            f = department.get(f);
            NhanVien nv = new NhanVien(b,c,f,d*e);
            nhanvien.add(nv);
        }
        for(NhanVien x : nhanvien){
            System.out.println(x);
        }
    }
}
