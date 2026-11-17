package javacuason;
import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            String s = sc.next();
            int res  = 0;
            for(int i=0;i<s.length();i++)
            {
                res = (res*10+s.charAt(i)-'0')%11;
            }
            if(res==0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
