package javacuason;
import java.util.*;
import java.util.Arrays;

public class JAVACUASON{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0; i<n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            boolean ok = false;
            for(int i=0; i+2<n; i++)
            {
                for(int j=i+1; j+1<n; j++)
                {
                    if(ok) break;
                    for(int k = j+1; k< n; k++)
                    {
                        if(ok) break;
                        if(a[i]*a[i]+a[j]*a[j]==(a[k]*a[k]))
                        {
                            ok = true;
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
            if(!ok) System.out.println("NO");
        }
    }
} 