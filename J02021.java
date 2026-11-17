package javacuason;
import java.util.*;
public class J02021 {
    static int n,k;
    static int dem;
    static int[] a = new int[11];
    static void Try(int pos)
    {
        for(int i = a[pos-1]+1; i<=n-k+pos; i++)
        {
            a[pos] = i;
            if(pos==k)
            {
                dem++;
                for(int j=1;j<=k;j++)
                {
                    System.out.print(a[j]);
                }
                System.out.print(" ");
            }
            else Try(pos+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.printf("\nTong cong co %d to hop", dem);
    }
}
