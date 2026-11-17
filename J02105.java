package javacuason;
import java.util.*;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> v = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            List<Integer> test = new ArrayList<>();
            for(int j=1;j<=n;j++)
            {
                if(a[i][j]==1)
                {
                    test.add(j);
                }
            }
            v.add(test);
        }
        for(int i=0;i<v.size();i++)
        {
            System.out.printf("List(%d) =",i+1);
            for(int j=0;j<v.get(i).size();j++)
            {
                System.out.print(" "+v.get(i).get(j));
            }
            System.out.println("");
        }
    }
}
