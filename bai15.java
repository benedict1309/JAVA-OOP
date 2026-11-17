package javacuason;
import java.util.*;

public class bai15{
    static class GiangVien{
        String id;
        String name;
        String subject;
        double tongDiem;
        String status;
        
        public GiangVien(int idNum, String name, String code, double tin, double chuyenMon)
        {
            this.id = String.format("GV%02d", idNum);
            this.name = name;
            char monChar = code.charAt(0);
            if(monChar == 'A') this.subject = "TOAN";
            else if (monChar == 'B') this.subject ="LY";
            else if(monChar == 'C') this.subject = "HOA";
            char utChar = code.charAt(1);
            double uuTien =0.0;
            if(utChar == '1') uuTien = 2.0;
            else if(utChar == '2') uuTien = 1.5;
            else if(utChar == '3') uuTien = 1.0;
            else if(utChar =='4') uuTien = 0.0;
            this.tongDiem = tin*2+chuyenMon+uuTien;
            if(this.tongDiem >= 18.0){
                this.status = "TRUNG TUYEN";
            }else{
                this.status = "LOAI";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<GiangVien> list = new ArrayList<>();
        for(int i = 1; i<=n;i++)
        {
            String name = sc.nextLine().trim();
            String code = sc.nextLine().trim();
            double tin = Double.parseDouble(sc.nextLine().trim());
            double chuyenMon = Double.parseDouble(sc.nextLine().trim());
            list.add(new GiangVien(i,name,code,tin,chuyenMon));
        }
        list.sort((a,b)->{
            if(Double.compare(b.tongDiem, a.tongDiem) != 0) return Double.compare(b.tongDiem, a.tongDiem);
            return a.id.compareTo(b.id);
        });
        for(GiangVien gv: list)
        {
            System.out.printf("%s %s %s %.1f %s\n", gv.id, gv.name, gv.subject, gv.tongDiem, gv.status);
        }
        sc.close();
    }
}
