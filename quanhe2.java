package javacuason;
import java.util.*;
class KhachHang{
    String diachi,tenKH;
    int khachHangID;
    public KhachHang(String diachi,String tenKH,int khachHangID){
        this.diachi = diachi;
        this.tenKH = tenKH;
        this.khachHangID = khachHangID;
    }
}
class HoaDon{
    int hoaDonID;
    KhachHang khachhang;
    String ngayBan;
    double tongTien;
    public HoaDon( int hoaDonID,KhachHang khachhang, String ngayBan,double tongTien){
        this.hoaDonID = hoaDonID;
        this.khachhang = khachhang;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }
    public int gethoaDonID(){
        return hoaDonID;
    }
    @Override
    public String toString(){
        return "Ma Hoa Don: "+hoaDonID+" | "+khachhang.tenKH+" | "+ngayBan+" | Total: "+tongTien;
    }
}
class MatHangMua{
    HoaDon hd;
    int matHangMuaID;
    MatHang mh;
    int soLuong;
    static int cnt = 0;
    public MatHangMua(HoaDon hd, int matHangMuaID,MatHang mh,int soLuong){
        cnt++;
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuong = soLuong;
    }
    @Override
    public String toString(){
        return hd.gethoaDonID()+" "+mh.matHangID+" "+mh.tenMatHang+" "+mh.gia+" "+mh.soLuong;
    }
}
class MatHang{
    double gia;
    int matHangID,soLuong;
    String tenMatHang;
    public MatHang(double gia,int matHangID,int soLuong,String tenMatHang){
        this.gia = gia;
        this.matHangID = matHangID;
        this.soLuong = soLuong;
        this.tenMatHang = tenMatHang;
    }
     public double getGia() {
        return gia;
    }

    public int getMatHangID() {
        return matHangID;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
public class quanhe2 {
    public static void main(String[] args) {
        MatHang x = new MatHang(123.4,8386,2,"Segtoy");
        MatHang y = new MatHang(345.6,7777,7,"JAV");
        MatHang z = new MatHang(365.6,3000,1,"Wife");
        KhachHang a = new KhachHang("LonDon","Benedict Bridgerton",88886666);
        HoaDon hd1 = new HoaDon(001, a,"13/09/2006",x.getGia()*x.getSoLuong()
                                 +y.getGia()*y.getSoLuong());
        MatHangMua b = new MatHangMua(hd1,x.getMatHangID(),x,x.getSoLuong());
        MatHangMua c = new MatHangMua(hd1,y.getMatHangID(),y,y.getSoLuong());    
        System.out.println(hd1);
        System.out.println(b);
        System.out.println(c);
    }
}
