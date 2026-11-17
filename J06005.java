package javacuason;
import java.util.*;
class KhachHang{
    String namekh,sex,birth,add;
    public KhachHang(String b,String c,String d,String e){
        namekh = b;
        sex = c;
        birth = d;
        add = e;
    }
}
class MatHang{
    String namemh,dvi;
    long giamua,giaban;
    public MatHang(String b, String c,long d,long e){
        namemh = b;
        dvi = c;
        giamua = d;
        giaban = e;
    }
}
class HoaDon implements Comparable<HoaDon>{
    String mahd,tenkh,diachi,tenmh;
    long solg,tien,loinhuan;
    public HoaDon(KhachHang a , MatHang b, String c,long d){
        mahd = c;
        tenkh = a.namekh;
        diachi = a.add;
        tenmh = b.namemh;
        solg = d;
        tien = b.giaban*d;
        loinhuan = tien - b.giamua*d;
    }
    @Override
    public String toString(){
        return mahd+" "+tenkh+" "+diachi+" "+tenmh+" "+solg+" "+tien+" "+loinhuan;
    }
    @Override
    public int compareTo(HoaDon o){
        return Long.compare(o.loinhuan,this.loinhuan);
    }
}
public class J06005{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String,KhachHang> khachhang = new HashMap<>();
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            KhachHang kh = new KhachHang(a,b,c,d);
            khachhang.put(String.format("KH%03d",i),kh);
        }
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String,MatHang> mathang = new HashMap<>();
        for(int i=1;i<=m;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            long c = Long.parseLong(sc.nextLine());
            long d = Long.parseLong(sc.nextLine());
            MatHang mh = new MatHang(a,b,c,d);
            mathang.put(String.format("MH%03d",i), mh);
        }
        int k = Integer.parseInt(sc.nextLine());
        List<HoaDon> list = new ArrayList<>();
        for(int i=1;i<=k;i++){
            String a = sc.next();
            String b = sc.next();
            long c = sc.nextInt();
            HoaDon hd = new HoaDon(khachhang.get(a),mathang.get(b),
                                String.format("HD%03d",i),c);
            list.add(hd);
        }
        Collections.sort(list);
        for(HoaDon x : list){
            System.out.println(x);
        }
    }
}
