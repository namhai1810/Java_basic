/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author namhai18
 */
class sv1{
    String masv,name, lop, dob;
    float gpa;

    public sv1() {
        this.masv = "";
        this.name ="";
        this.lop = "";
        this.dob ="";
    }
    
    public sv1(int masv, String name, String lop, String dob, float gpa) {
        this.masv = String.format("B20DCCN%03d", masv);
        this.name = name;
        this.lop = lop;
        this.dob = std(dob);
        this.gpa = gpa;
    }
    public static String std(String dob){
        StringBuilder sb = new StringBuilder(dob);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        return sb.toString();
    }

    @Override
    public String toString() {
        return masv + " " + name + " " + lop + " " + dob + " " +String.format("%.2f", gpa);
    }
    
    
}
public class Danh_sach_doi_tuong_sinh_vien_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv1> arr = new ArrayList<>();
        for(int i =0; i < t;i++){
            arr.add(new sv1(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        for(int i =0; i < t;i++){
            System.out.println(arr.get(i));
        }
        
    }
}
//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19
