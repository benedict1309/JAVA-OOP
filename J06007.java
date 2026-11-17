/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
public class J06007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String a = sc.next();
            String b = sc.nextLine();
        }
        int m = Integer.parseInt(sc.nextLine());
        Map<String,String> gv = new HashMap<>();
        for(int i=1;i<=m;i++){
            String a = sc.next();
            String b = sc.nextLine();
            gv.put(a, b.trim());
        }
        int k = Integer.parseInt(sc.nextLine());
        Map<String,Double> hp = new LinkedHashMap<>();
        for(int i=1;i<=k;i++){
            String a = sc.next();
            String b = sc.next();
            double c = sc.nextDouble();
            if(hp.containsKey(gv.get(a))) hp.put(gv.get(a), hp.get(gv.get(a))+c);
            else hp.put(gv.get(a),c);
        }
        for(Map.Entry<String,Double> x : hp.entrySet()){
            System.out.println(x.getKey()+" "+String.format("%.2f",x.getValue()));
        }
    }
}
/*2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
3
GV01 Nguyen Van An
GV02 Hoang Binh Minh
GV03 Ta Quy Duong
4
GV01 INT1155 113.2
GV02 INT1306 126.72
GV03 INT1306 130.9
GV01 INT1306 113.2*/