package javacuason;
import java.util.*;
class Pair<T,U>{
    int first,second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
    private boolean nt(int x){
        if(x<2) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        if(nt(first) && nt(second)) return true;
        return false;
    }
    public String toString(){
        return first+" "+second;
    }
}
public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
