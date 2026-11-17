package javacuason;
import java.util.*;
public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 2000000;
        long[] sieve = new long[MAX+1];
        for(int i=2;i<=MAX;i++)
        {
            if(sieve[i]==0)
            {
                sieve[i] = i;
                for(int j=i*2;j<=MAX;j+=i)
                {
                    if(sieve[j]==0)
                    {
                        sieve[j] = i;
                    }
                }
            }
        }
        int n = sc.nextInt();
        long sum = 0;
        while(n-->0)
        {
            int m = sc.nextInt();
            while(m>1)
            {
                sum+=sieve[m];
                m/=sieve[m];
            }
        }
        System.out.println(sum);
    }
}
