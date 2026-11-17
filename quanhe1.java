package javacuason;
import java.util.*;
class GiangVien{
    String ma,hoten,hesoKK;
    double tienluong;
    public GiangVien(){
        ma="";
        hoten="";
        hesoKK="";
        tienluong=0.0;
    }
    public GiangVien(String ma,String hoten,String hesoKK){
        setMa(ma);
        setHoten(hoten);
        setHesoKK(hesoKK);
    }
    public String getMa(){
        return ma;
    }
    public String getHoten(){
        return hoten;
    }
    public String getHesoKK(){
        return hesoKK;
    }
    private void setMa(String ma){
        this.ma = ma;
    }
    private void setHoten(String hoten){
        this.hoten = hoten;
    }
    private void setHesoKK(String hesoKK){
        this.hesoKK = hesoKK;
    }
}
class GVThinhGiang extends GiangVien implements ITienLuong{
    int sogioday;
    public GVThinhGiang(String ma,String hoten,int sogioday,String hesoKK){
        this.sogioday = sogioday;
        super(ma,hoten,hesoKK);
    }
    public int getSogioday(){
        return sogioday;
    }
    public void setSogioday(int sogioday){
        this.sogioday = sogioday;
    }
    @Override
    public String toString(){
        return ma+" "+hoten+" "+getITienLuong();
    }
    @Override
    public double getITienLuong(){
        if(hesoKK.equals("C")) return sogioday*100*1;
        if(hesoKK.equals("B")) return sogioday*100*1.2;
        return sogioday*100*1.5;
    }
}
class GVCoHuu extends GiangVien implements ITienLuong{
    double hesoLuong;
    public GVCoHuu(){};
    public GVCoHuu(String ma,String hoten,double hesoLuong,String hesoKK){
        this.hesoLuong = hesoLuong;
        super(ma,hoten,hesoKK);
    }
    private double getHesoluong(){
        return hesoLuong;
    }
    private void setHesoluong(double hesoLuong){
        this.hesoLuong = hesoLuong;
    }
    @Override
    public String toString(){
        return ma+" "+hoten+" "+getITienLuong();
    }
     @Override
    public double getITienLuong(){
        if(hesoKK.equals("C")) return hesoLuong*230*1;
        if(hesoKK.equals("B")) return hesoLuong*230*1.2;
        return hesoLuong*230*1.5;
    }
}
interface ITienLuong{
    double getITienLuong();
}
public class quanhe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        double d = Double.parseDouble(sc.nextLine());
        GVCoHuu gv1 = new GVCoHuu(a.toUpperCase(),b,d,c.toUpperCase());
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        int e = Integer.parseInt(sc.nextLine());
        GVThinhGiang gv2 = new GVThinhGiang(a.toUpperCase(),b,e,c.toUpperCase());
        System.out.println(gv1);
        System.out.println(gv2);
    }
}
