package javacuason;
import java.util.*;
class Lecturer{
    String name,hp;
    double time;
    public Lecturer(String a,String b,double  c){
        name = a;
        hp = b;
        time = c;
    }
    @Override
    public String toString(){
        return hp+" "+time;
    }
}
public class J06008 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
         Map<String,String> mh = new HashMap<>();
        for(int i=1;i<=n;i++){
            String a = sc.next();
            String b = sc.nextLine();
            mh.put(a, b.trim());
        }
        int m = Integer.parseInt(sc.nextLine());
        Map<String,String> gv = new HashMap<>();
        for(int i=1;i<=m;i++){
            String a = sc.next();
            String b = sc.nextLine();
            gv.put(a, b.trim());
        }
        int k = Integer.parseInt(sc.nextLine());
        Map<Lecturer,String> hp = new LinkedHashMap<>();
        for(int i=1;i<=k;i++){
            String a = sc.next();
            String b = sc.next();
            double c = sc.nextDouble();
            Lecturer lec= new Lecturer(gv.get(a),mh.get(b), c);
            hp.put(lec,a);
        }
        String ss = sc.next();
        double tong = 0;
        System.out.println("Giang vien: "+gv.get(ss));
        for(Map.Entry<Lecturer,String> x : hp.entrySet()){
            if(x.getValue().equals(ss)){
                System.out.println(x.getKey());
                tong+=x.getKey().time;
            }
        }
        System.out.println("Tong: "+String.format("%.2f",tong));
    }
}/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
4
GV01 INT1155 113.2
GV02 INT1306 126.72
GV01 INT1306 113.2
GV02 INT1155 126.72*/