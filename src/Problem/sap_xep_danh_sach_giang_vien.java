/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.*;

/**
 *
 * @author namhai18
 */
class gv implements Comparable<gv>{
    String ma, name, subject;

    public gv(int ma, String name, String subject) {
        this.ma = String.format("GV%02d", ma);
        this.name = name;
        String [] k = subject.split("\\s++");
        String res = "";
        for(int i = 0; i < k.length;i++){
            res += k[i].substring(0,1).toUpperCase();
        }
        this.subject = res;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + subject;
    }

    @Override
    public int compareTo(gv o) {
        String [] a1 = name.split("\\s++");
        String [] a2 = o.name.split("\\s++");
        if(!a1[a1.length -1].equals(a2[a2.length-1])){
            return a1[a1.length -1].compareTo(a2[a2.length-1]);
        }
        return this.ma.compareTo(o.ma);
    }
    
    
    
    
}
public class sap_xep_danh_sach_giang_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<gv> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i =0 ;i < t;i++){
            arr.add(new gv(i+1, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i =0; i <t;i++){
            System.out.println(arr.get(i));
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin