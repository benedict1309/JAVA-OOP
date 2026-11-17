package javacuason;
import java.util.*;
public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            String n = sc.next();
            String m = new StringBuilder(n).reverse().toString();
            boolean ok = true;
            if(n.equals(m))
            {
                for(int i=0;i<n.length();i++)
                {
                    if((n.charAt(i)-'0')%2 != 0)
                    {
                        ok = false;
                        break;
                    }
                }
            }else ok = false;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
