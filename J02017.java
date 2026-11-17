package javacuason;
import java.util.*;
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> vector = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            vector.add(x);
        }
        //int vs = new int[n];
        while(true){
            boolean ok = false;
            for(int i=0;i+1<vector.size();i++)
            {
                if((vector.get(i)+vector.get(i+1)) % 2 == 0){
                    vector.subList(i,i+2).clear();
                    ok = true;
                }
            }
            if(!ok) {
                System.out.println(vector.size());
                break;
            }
        }
    }
}
