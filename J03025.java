package javacuason;

import java.util.*;
public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-->0)
        {
            String n = sc.next();
            int dem = 0;
            int l=0, r = n.length()-1;
            while(l<r){
                if(n.charAt(l)!=n.charAt(r)) dem++;
                r--;l++;
            }
            if(dem==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
