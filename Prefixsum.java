package javacuason;
import java.util.*;

public class Prefixsum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i<n ; i++) a[i] = sc.nextInt();
            int index = 0;
            int[] prefixsum = new int[n+1];
            for(int i=1; i < n+1; i++)
            {
                prefixsum[i]=prefixsum[i-1]+a[i-1];
            }
            boolean ok = false;
            for(int i = 2; i + 1 <= n;i++)
            {
                if(prefixsum[i-1] == (prefixsum[n] - prefixsum[i]))
                {
                    ok = true;
                    System.out.println(i);
                    break;
                }
            }
            if(!ok) System.out.println(-1);
        }
    }
}