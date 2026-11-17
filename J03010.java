package javacuason;
import java.util.*;
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = "@ptit.edu.vn";
        Map<String,Integer> mp = new HashMap<>();
        short t = sc.nextShort();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            Scanner ss = new Scanner(s);
            List<String> sss = new ArrayList<>();
            while(ss.hasNext())
            {
                sss.add(ss.next());
            }
            String res = sss.get(sss.size()-1).toLowerCase();
            for(int i=0;i<sss.size()-1;i++)
            {
                res+=Character.toLowerCase(sss.get(i).charAt(0));
            }
            mp.put(res,mp.getOrDefault(res,0)+1);
            if( mp.get(res) == 1){
                System.out.println(res+model);
            }else{
                System.out.println(res+mp.get(res).toString()+model);
            }
        }
    }
}
