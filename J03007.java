package javacuason;
import java.util.*;
public class J03007 {
    static int tong(String s)
    {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while (t-->0) {            
            String n = sc.next();
            String m = new StringBuilder(n).reverse().toString();
            boolean ok = false;
            if(n.equals(m) && n.charAt(0)==n.charAt(n.length()-1) && tong(n)%10 == 0) ok = true;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
