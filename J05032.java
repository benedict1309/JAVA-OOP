/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
class Human implements Comparable<Human>{
    String name,birth;
    public Human(String a, String b){
        name = a;
        birth = b;
    }
    @Override
    public int compareTo(Human o){
        int y1 = Integer.parseInt(this.birth.substring(6));
        int y2 = Integer.parseInt(o.birth.substring(6));
        int m1 = Integer.parseInt(this.birth.substring(3,5));
        int m2 = Integer.parseInt(o.birth.substring(3,5));
        int d1 = Integer.parseInt(this.birth.substring(0,2));
        int d2 = Integer.parseInt(o.birth.substring(0,2));
        if(y1==y2){
            if(m1==m2) return Integer.compare(d1, d2);
            return Integer.compare(m1, m2);
        }
        return Integer.compare(y1, y2);
    }
    @Override
    public String toString(){
        return name;
    }
}
public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Human> list = new ArrayList<>();
        while(n-->0){
            String[] s = sc.nextLine().split("\\s+");
            Human h = new Human(s[0],s[1]);
            list.add(h);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1)+"\n"+list.get(0));
    }
}
