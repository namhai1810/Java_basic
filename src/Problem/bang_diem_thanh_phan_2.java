/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class tp implements Comparable<tp>{
    String ma, name,lop;
    float a,b,c;

    public tp(String ma, String name, String lop, float a, float b, float c) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(tp o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + lop + " " + String.format("%.1f", a) +" " + String.format("%.1f", b) + " "+ String.format("%.1f", c) ;
    }
    
    
}
public class bang_diem_thanh_phan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<tp> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arr.add(new tp(sc.nextLine(), sc.nextLine(),sc.nextLine(), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()) ));
        }
        Collections.sort(arr);
        for (int i = 0; i < t; i++) {
            System.out.println((i+1) + " " + arr.get(i));
        }
        
    }
}
//3
//B20DCCN999
//Nguyen Van An
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van Nam
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Tran Hoa Binh
//D20CQCN04-B
//9.0
//5.0
//6.0