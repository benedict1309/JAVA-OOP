package javacuason;
import java.util.*;
public class J04007 {
    static class NhanVien{
        String ma,name,sex,birth,add,tax,day;
        public NhanVien(String name, String sex, String birth, String add, String tax, String day){
            this.ma = "00001";
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.add = add;
            this.tax = tax;
            this.day = day;
        }
        public void in(){
            System.out.printf("%s %s %s %s %s %s %s",this.ma, this.name, this.sex, this.birth, this.add,this.tax, this.day);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        String c = sc.next();
        sc.nextLine();
        String d = sc.nextLine();
        String f = sc.next();
        String g = sc.next();
        NhanVien nv = new NhanVien(a,b,c,d,f,g);
        nv.in();
    }
}
