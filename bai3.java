package javacuason;
import java.util.*;
public class bai3 {
    static class giangvien{
        String name;
        String sub;
        String stt;
        String ln;
        
        public giangvien(String name, String sub, int code)
        {
            this.name = name;
            this.sub = shortsub(sub);
            this.stt = String.format("GV%02d", code);
            this.ln = last(name);
        }
        private String last(String name)
        {
            String[] words = name.trim().split("\\s+");
            return words[words.length-1];
        }
        private String shortsub(String sub)
        {
            String[] words = sub.trim().split("\\s+");
            String res="";
            for(int i=0;i<words.length;i++)
            {
                res+=Character.toUpperCase(words[i].charAt(0));
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<giangvien> lec = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String name = sc.nextLine();
            String mon = sc.nextLine();
            giangvien gv = new giangvien(name,mon,i);
            lec.add(gv);
        }
        lec.sort((a,b)->
        {
           if(!a.ln.equals((b.ln))) return a.ln.compareTo(b.ln);
           return a.stt.compareTo(b.stt);
        });
        for(giangvien gv : lec)
        {
            System.out.println(gv.stt +" "+gv.name+" "+gv.sub);
        }
        sc.close();
    }
}
