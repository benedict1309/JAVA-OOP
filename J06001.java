package javacuason;
import java.util.*;
public class J06001 {
    static class Pro{
        String name;
        long cost;
        public Pro(String name, long cost){
            this.name = name;
            this.cost = cost;
        }
    }
    static class Bill{
        String sp,hd,ten;
        long sale,pay;
        public Bill(String ma,int hd,long solg,Pro o){
            sp = ma;
            this.hd = String.format("%03d", hd);
            ten = o.name;
            sale = giamgia(solg,o.cost);
            pay = o.cost*solg - sale;
        }
        private long giamgia(long s, long e){
            if(s>=150) return s*e*50/100;
            if(s>=100) return s*e*30/100;
            if(s>=50) return s*e*15/100;
            return 0;
        }
        @Override
        public String toString(){
            return sp+"-"+hd+" "+ten+" "+sale+" "+pay;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String,Pro> list1 = new HashMap<>();
        while(n-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            for(int i=1;i<=2;i++){
                long c = Long.parseLong(sc.nextLine());
                Pro pro = new Pro(b,c);
                list1.put(a+(i+""),pro);
            }
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Bill> list2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            String d = sc.next();
            long solg = sc.nextLong();
            Bill bill = new Bill(d,i,solg,list1.get(d));
            list2.add(bill);
        }
        for(Bill x: list2){
            System.out.println(x);
        }
    }
}
