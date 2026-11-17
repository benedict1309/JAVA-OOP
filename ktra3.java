package javacuason;
import java.util.*;
public class ktra3 {
    static boolean nt(int n){
       if(n<2) return false;
       for(int i=2;i*i<=n;i++){
           if(n%i==0) return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tong=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(nt(x)){
                continue;
            }
            int d=1;
            while(true){
                if(nt(x-d)||nt(x+d)){
                    tong+=d;
                    break;
                }
                d++;
            }
        }
        System.out.println(tong);
    }
}
