/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacuason;
import java.util.*;
class Student implements Comparable<Student>{
    String ma,ten,sdt;
    int nhom;
    public Student(String ma,String ten, String sdt,int nhom){
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }
    @Override
    public int compareTo(Student o){
        return this.ma.compareTo(o.ma);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sdt+" "+nhom;
    }
}
public class J06004 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<Student> list1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = Integer.parseInt(sc.nextLine());
            Student student = new Student(a,b,c,d);
            list1.add(student);
        }
        Collections.sort(list1);
        HashMap<Integer,String> mp = new HashMap<>();
        for(int i=1;i<=m;i++){
            String e = sc.nextLine();
            mp.put(i, e);
        }
        for(Student x : list1){
            System.out.println(x+" "+mp.get(x.nhom));
        }
    }
}
