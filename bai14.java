package javacuason;
import java.util.*;
public class bai14 {
    static class SinhVien{
        String id,name,lop,dob;
        double gpa;
        
        SinhVien(int i, String name, String lop, String dob, double gpa){
            this.id = String.format("B20DCCN%03d", i);
            this.name = formatName(name);
            this.lop = lop;
            this.dob = formatDob(dob);
            this.gpa = gpa;
        }
        
        private String formatName(String s){
            String[] words = s.trim().toLowerCase().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String w : words)
            {
                if(!w.isEmpty()){
                    sb.append(Character.toUpperCase(w.charAt(0)))
                       .append(w.substring(1)).append(" ");
                }
            }
            return sb.toString().trim();
        }
        
        private String formatDob(String s){
            String[] p = s.trim().split("/");
            if(p[0].length() == 1) p[0] = "0" + p[0];
            if(p[1].length()==1) p[1] ="0"+p[1];
            return p[0]+"/"+p[1]+"/"+p[2];
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        List<SinhVien> list = new ArrayList<>();
        for(int i=1;i<=a;i++)
        {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine().trim());
            list.add(new SinhVien(i,name,lop,dob,gpa));
        }
        list.sort((n,b) -> Double.compare(b.gpa, n.gpa));
        for(SinhVien sv: list)
        {
            System.out.printf("%s %s %s  %s %.2f\n", sv.id, sv.name, sv.lop, sv.dob,sv.gpa);
        }
        sc.close();
    }
}
