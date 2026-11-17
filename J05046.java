package javacuason;
import java.util.*;
public class J05046 {
    static class Pro{
        String ma,ten;
        long chietkhau,thanhtien;
        public Pro(String ma,String ten, long solg,long gia){
            this.ma = ma;
            this.ten = ten;
            this.chietkhau = getchietkhau(solg, gia);
            this.thanhtien = solg*gia - this.chietkhau;
        }
        private long getchietkhau(long solg,long gia){
            if(solg > 10) return solg*gia*5/100;
            if(solg >7) return solg*gia*2/100;
            if(solg >4) return solg*gia*1/100;
            return 0;
        }
        @Override
        public String toString(){
            return ma+" "+ten+" "+chietkhau+" "+thanhtien;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pro> p = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            long b = Long.parseLong(sc.nextLine());
            long c = Long.parseLong(sc.nextLine());
            String[] ss = a.trim().split("\\s+");
            String d = ""+ss[0].charAt(0)+Character.toUpperCase(ss[1].charAt(0));
            int stt = mp.getOrDefault(d, 0);
            mp.put(d,stt+1);
            Pro pro = new Pro(d+String.format("%02d", mp.get(d)),a,b,c);
            p.add(pro);
        }
        for(Pro x : p){
            System.out.println(x);
        }
    }
}
