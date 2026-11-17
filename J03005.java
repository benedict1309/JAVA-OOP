package javacuason;
import java.util.*;
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            List<String> words = new ArrayList<>();
            Scanner ss = new Scanner(s);
            while(ss.hasNext()){
                words.add(ss.next());
            }
            String temp = words.get(0).toUpperCase();
            words.set(0,temp);
            for(int i=1;i<words.size();i++)
            {
                String tmp = Character.toUpperCase(words.get(i).charAt(0)) + words.get(i).substring(1).toLowerCase();
                words.set(i,tmp);
            }
            for(int i=1;i<words.size();i++)
            {
                System.out.print(words.get(i));
                if(i != words.size()-1) System.out.print(" ");
            }
            System.out.print(", " + words.get(0)+"\n");
        }
    }
}
