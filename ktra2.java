
package javacuason;
import java.util.Scanner;
public class ktra2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int du=0;
        int dem=0;
        for(int i=1;i<=n;i++){
            int x=i;
            int mu=1;
            while(x>0){
                mu=(mu*10)%k;
                x/=10;
            }
            du=(du*mu+i)%k;
            if(du==0){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
