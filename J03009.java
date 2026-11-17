package javacuason;
import java.util.*;
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        sc.nextLine();
        while(t-->0)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Scanner john = new Scanner(s1);
            Scanner sin = new Scanner(s2);
            List<String> list1 = new ArrayList<>(); 
            List<String> list2 = new ArrayList<>();
            while(john.hasNext())
            {
                list1.add(john.next());
            }
            while(sin.hasNext())
            {
                list2.add(sin.next());
            }
            List<String> list3 = new ArrayList<>();
            for(String x : list1)
            {
                if(!list2.contains(x) && !list3.contains(x)){
                    list3.add(x);
                }
            }
            Collections.sort(list3);
            for(String x : list3)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
