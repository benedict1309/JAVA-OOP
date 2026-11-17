package javacuason;
import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        scanner.nextLine();
        while(t-->0)
        {
            String s = scanner.nextLine();
            Scanner ss = new Scanner(s);
            List<String> tokens = new ArrayList<>();
            while(ss.hasNext()){
                tokens.add(ss.next());
            }
            for(int i=0;i<tokens.size();i++)
            {
                String word = tokens.get(i);
                String c = Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase();
                tokens.set(i, c);
            }
            System.out.println(String.join(" ",tokens));
        }
    }
}
