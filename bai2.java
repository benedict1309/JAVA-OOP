package javacuason;
import java.util.*;
public class bai2 {
    static class student{
        String name;
        int c;
        int t;
        
        public student(String name, int c, int t)
        {
            this.name = stand(name);
            this.c = c;
            this.t = t;
        }
        private String stand(String name){
            Scanner ss = new Scanner(name);
            String tmp = "";
            while(ss.hasNext())
            {
                String res = ss.next();
                tmp += res.substring(0,1).toUpperCase()+res.substring(1).toLowerCase()+ " ";
            }
            return tmp.trim();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<student> students = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String ten = sc.nextLine();
            int d = sc.nextInt();
            int s = sc.nextInt();
            sc.nextLine();
            student st = new student(ten,d,s);
            students.add(st);
        }
        students.sort((a,b)-> {
            if(a.c != b.c) return Integer.compare(b.c,a.c);
            else if(a.t != b.t) return Integer.compare(a.t,b.t);
            return a.name.compareTo(b.name);});
        for(student st : students)
        {
            System.out.println(st.name +" "+ st.c + " "+st.t);
        }
        sc.close();
    }
}
