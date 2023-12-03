/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class sv2{
    String masv,name, lop, dob;
    float gpa;
    
    public sv2(int masv, String name, String lop, String dob, float gpa) {
        this.masv = String.format("B20DCCN%03d", masv);
        this.name = stdn(name);
        this.lop = lop;
        this.dob = stddob(dob);
        this.gpa = gpa;
    }
    public static String stddob(String dob){
        StringBuilder sb = new StringBuilder(dob);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        return sb.toString();
    }
    public static String stdn(String name){
        String [] arr = name.trim().toLowerCase().split("\\s++");
        String res = "";
        for(int i =0; i < arr.length;i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return masv + " " + name + " " + lop + " " + dob + " " +String.format("%.2f", gpa);
    }
    
    
}
public class danh_sach_doi_tuong_sinh_vien_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv2> arr = new ArrayList<>();
        for(int i =0; i < t;i++){
            arr.add(new sv2(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        for(int i =0; i < t;i++){
            System.out.println(arr.get(i));
        }
        
    }
}
//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1