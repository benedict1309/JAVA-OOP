package javacuason;
import java.util.*;
class KhachHang {
    private String diaChi;
    private String tenKH;
    private int khachHangID;

    public KhachHang(String diaChi, String tenKH, int khachHangID) {
        this.diaChi = diaChi;
        this.tenKH = tenKH;
        this.khachHangID = khachHangID;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }
}

class MatHang {
    private double gia;
    private int matHangID;
    private int soLuong; // Số lượng tồn kho
    private String tenMatHang;

    public MatHang(double gia, int matHangID,
                   int soLuong, String tenMatHang) {
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

    public void giamSoLuong(int soLuongMua) {
        if (soLuongMua <= 0 || soLuongMua > soLuong) {
            throw new IllegalArgumentException(
                    "So luong mua khong hop le: " + tenMatHang);
        }

        soLuong -= soLuongMua;
    }

    public void themMatHangVaoKho(ArrayList<MatHang> kho) {
        kho.add(this);
    }
}

class MatHangMua {
    private HoaDon hd;
    private int matHangMuaID;
    private MatHang mh;
    private int soLuong; // Số lượng khách mua
    private double donGia; // Lưu giá tại thời điểm mua

    public MatHangMua(HoaDon hd, int matHangMuaID,
                      MatHang mh, int soLuong) {
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuong = soLuong;
        this.donGia = mh.getGia();
    }

    public double getThanhTien() {
        return donGia * soLuong;
    }

    @Override
    public String toString() {
        return String.format(
                "%d | %s | %.0f | %d | %.0f",
                mh.getMatHangID(),
                mh.getTenMatHang(),
                donGia,
                soLuong,
                getThanhTien()
        );
    }
}

class HoaDon {
    private int hoaDonID;
    private KhachHang khachHang;
    private String ngayBan;
    private double tongTien;

    private ArrayList<MatHangMua> danhSachMua = new ArrayList<>();

    public HoaDon(int hoaDonID, KhachHang khachHang, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.khachHang = khachHang;
        this.ngayBan = ngayBan;
        this.tongTien = 0;
    }

    public void themHoaDon(ArrayList<HoaDon> danhSachHoaDon) {
        if (danhSachMua.isEmpty()) {
            throw new IllegalStateException(
                    "Hoa don phai co it nhat mot mat hang");
        }

        danhSachHoaDon.add(this);
    }

    public void themMatHangMuaCuaHoaDon(MatHang mh, int soLuongMua) {
        // Kiểm tra và trừ tồn kho
        mh.giamSoLuong(soLuongMua);

        // Mã dòng chi tiết tăng lần lượt trong hóa đơn
        int maChiTiet = danhSachMua.size() + 1;

        MatHangMua item = new MatHangMua(
                this, maChiTiet, mh, soLuongMua);

        danhSachMua.add(item);
        tongTien += item.getThanhTien();
    }

    public void inHoaDon() {
        System.out.println("Hoa don: " + hoaDonID);
        System.out.println("Khach hang: " + khachHang.getTenKH());
        System.out.println("Dia chi: " + khachHang.getDiaChi());
        System.out.println("Ngay ban: " + ngayBan);

        System.out.println("Ma | Ten | Don gia | So luong | Thanh tien");

        for (MatHangMua item : danhSachMua) {
            System.out.println(item);
        }

        System.out.printf("Tong tien: %.0f%n", tongTien);
    }
}

public class quanhe3 {
    public static void main(String[] args) {
        ArrayList<MatHang> kho = new ArrayList<>();
        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();

        // 1. Tạo và thêm ba mặt hàng vào kho
        MatHang x = new MatHang(10000, 1, 100, "X");
        MatHang y = new MatHang(20000, 2, 50, "Y");
        MatHang z = new MatHang(15000, 3, 80, "Z");

        x.themMatHangVaoKho(kho);
        y.themMatHangVaoKho(kho);
        z.themMatHangVaoKho(kho);

        // 2. Tạo khách hàng và hóa đơn
        KhachHang a = new KhachHang("Ha Noi", "Nguyễn Văn A", 1);
        HoaDon hd1 = new HoaDon(1, a, "15/11/2026");

        // Khách mua hai loại mặt hàng: X và Y
        hd1.themMatHangMuaCuaHoaDon(x, 2);
        hd1.themMatHangMuaCuaHoaDon(y, 3);

        // Lưu hóa đơn sau khi đã thêm mặt hàng
        hd1.themHoaDon(danhSachHoaDon);

        // 3. In hóa đơn
        hd1.inHoaDon();
    }
}