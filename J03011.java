package javacuason;
import java.util.*;
public class J03011 {
    static long gcd(long a, long b)
    {
        return (b==0) ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            long a = sc.nextLong();
            String b = sc.next();
            long res = 0;
            for(int i=0;i<b.length();i++)
            {
                 res = (res*10+(b.charAt(i)-'0'))%a;
            }
            System.out.println(gcd(a,res));
        }
    }
}
