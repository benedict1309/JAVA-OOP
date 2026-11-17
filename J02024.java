package javacuason;
import java.util.*;
public class J02024 {
    static List<List<Integer>> v = new ArrayList<>();
    static void cmp(List<Integer> s)
    {
        
    }
    static void Try(int a[], List<Integer> s, int n)
    {
        if(s.size() > n) return;
        v.add(s);
        for(int i=1;i<=n;i++)
        {
            if(s.contains(a[i])==false)
            {
                s.add(a[i]);
                Try(a,s,n);
                s.remove(s.size()-1);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i=1;i<=n;i++)
            {
                a[i] = sc.nextInt();
            }
            List<Integer> res = new ArrayList<>();
            Try(a,res,n);
        }
    }
}
