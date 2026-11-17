package javacuason;
import java.util.*;
public class Yasss {
    static class student{
        int id;
        String name;
        double tbc;
        int drl;
        String loai;
        
        public student(int id, String name, double tbc, int drl)
        {
            this.id = id;
            this.name = name;
            this.tbc = tbc;
            this.drl = drl;
            this.loai = hocbong(tbc,drl);
        }
        
        private String hocbong(double tbc, int drl)
        {
            if(tbc >= 3.6 && drl >= 90) return "XUATSAC";
            if(tbc >= 3.2 && drl >= 80) return "GIOI";
            if(tbc >= 2.5 && drl >= 70) return "KHA";
            else return "KHONG";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<student> students = new ArrayList<>();
        List<student> ok = new ArrayList<>();
        for(int i=0 ;i<n ;i++)
        {
            String name = sc.nextLine().trim();
            String[] scores = sc.nextLine().trim().split("\\s+");
            double tbc = Double.parseDouble(scores[0]);
            int drl = Integer.parseInt(scores[1]);
            
            student st = new student(i,name,tbc,drl);
            students.add(st);
            if(!st.loai.equals("KHONG"))
            {
                ok.add(st);
            }
        }
        ok.sort((a,b)->Double.compare(b.tbc, a.tbc));
        double cutoff = -1.0;
        if(!ok.isEmpty())
        {
            if(ok.size() <= m)
            {
                cutoff = 0.0;
            }else{
                cutoff = ok.get(m-1).tbc;
            }
        }
        for(student st : students)
        {
            if(!st.loai.equals("KHONG") && st.tbc >= cutoff){
                System.out.println(st.name+": "+st.loai);
            }else{
                System.out.println(st.name+": KHONG");
            }
        }
        sc.close();
    }
}
