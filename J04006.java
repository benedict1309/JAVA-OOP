package javacuason;
import java.util.*;
public class J04006 {
    static class SinhVien{
        String name,lop,birth,masv;
        double gpa;
        static int cnt = 0;
        private String standardize(String s){
            StringBuilder sb = new StringBuilder(s);
            if(sb.charAt(1)=='/') sb.insert(0, '0');
            if(sb.charAt(4)=='/') sb.insert(3,'0');
            return sb.toString();
        }
        public SinhVien(String name, String lop, String birth, double gpa){
            this.name = name;
            this.lop = lop;
            this.birth = standardize(birth);
            this.gpa = gpa;
            cnt++;
            this.masv = String.format("B20DCCN%03d", cnt);
        }
        public void In(){
            System.out.printf("%s %s %s %s %.2f",this.masv,this.name,this.lop,this.birth,this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        String c = sc.next();
        double d = sc.nextDouble();
        SinhVien sv = new SinhVien(a,b,c,d);
        sv.In();
    }
}
