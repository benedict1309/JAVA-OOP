package javacuason;
import java.util.*;

public class cmp{
    static int tich(String s)
    {
        int res = 1;
        for(int i=0; i<s.length();i++)
        {
            if(i%2==0 && s.charAt(i)!='0')
            {
                res*=(s.charAt(i)-'0');
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            int n = sc.nextInt();
            String[] s = new String[n];
            for(int i=0;i<n;i++){
                 s[i] = sc.next();            
            }
            /*for(int i=0; i+1<n; i++)
            {
                int nho = i;
                for(int j=i+1;j<n;j++)
                {
                    if(tich(s[nho])>=tich(s[j]) && nho != j){
                        if(tich(s[nho])>tich(s[j])){
                            nho = j;
                        }else if(Long.parseLong(s[nho]) > Long.parseLong(s[j])){
                            nho = j;
                        }
                    }
                }
                swap(s,nho,i);
            }*/
            Arrays.sort(s,(a,b) ->{
                int tich1 = tich(a);
                int tich2 = tich(b);
                if(tich1 != tich2)
                {
                    return Integer.compare(tich1, tich2);
                }
                return Long.compare(Long.parseLong(a), Long.parseLong(b));
            });
            for(int i=0; i < n; i++)
            {
                System.out.printf("%s ", s[i]);
            }
            System.out.println("");
        }
        sc.close();
    }
}
