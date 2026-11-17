package javacuason;
import java.util.*;
public class J02011 {
    static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;
    }
    static void in(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf(" %d",a[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i+1<n;i++)
        { 
           int res = i;
           boolean ok = false ;
           for(int j=i+1;j<n;j++)
           {
               if(i!=j && a[j]<a[res]) 
               {
                   res = j;
                   ok = true;
               }
           }
           if(!ok) break;
           swap(a,res,i);
           System.out.printf("Buoc %d:",i+1);
           in(a,n);
        }
    }
}
