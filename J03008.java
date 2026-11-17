package javacuason;
import java.util.*;
public class J03008 {
    static boolean[] prime = new boolean[11];
    static void init(){
        for(int i=0;i<=10;i++)
        {
            if(i==0 || i==1) prime[i] = false;
            else if(prime[i] == true)
            {
                for(int j=i*i;j<=10;j+=i)
                {
                    prime[j] = false;
                }
            }
        }
    }
    static boolean allprime(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!prime[s.charAt(i)-'0']) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays.fill(prime,true);
        init();
        short t = sc.nextShort();
        while(t-->0)
        {
            String s = sc.next();
            String ss = new StringBuilder(s).reverse().toString();
            if(s.equals(ss) && allprime(s))
            {
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
