package javacuason;
import java.util.*;
public class J02022 {
    static int n;
    static int[] a = new int[11];
    static boolean[] vs = new boolean[11];
    static void xuly()
    {
        for(int i=1;i<=n;i++)
        {
            if(i+1<=n && Math.abs(a[i]-a[i+1]) == 1) return;
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    static void Try(int pos)
    {
        for(int i = 1; i<=n;i++)
        {
            if(vs[i]==false)
            {
                a[pos] = i;
                vs[i] = true;
                if(pos==n)
                {
                    xuly();
                }
                else Try(pos+1);
                vs[i] = false;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            n = sc.nextInt();
            Try(1);
        }
    }
}
