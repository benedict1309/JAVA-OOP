package javacuason;
import java.util.*;
public class J04015 {
    static class Teacher{
        String ma,name;
        long bl,pc,tn;
        public Teacher(String ma,String name, long luong){
            this.ma = ma;
            this.name = name;
            this.bl = bacluong(this.ma);
            this.pc = phucap(this.ma);
            this.tn = this.bl*luong+this.pc;
        }
        private long bacluong(String s){
            String ss = s.substring(2, s.length());
            return Long.parseLong(ss);
        }
        private long phucap(String s){
            String ss = s.substring(0,2);
            if(ss.equals("HT")) return 2000000;
            if(ss.equals("HP")) return 900000;
            return 500000;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        long c = Long.parseLong(sc.nextLine());
        Teacher tr = new Teacher(a,b,c);
        System.out.println(tr.ma + " " + tr.name + " " + tr.bl + " " + tr.pc + " " + tr.tn);
    }
}
