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
class xd implements Comparable<xd>{
    String ma;
    long sl;
    String hang;
    long donGia, thue,sum;
    public xd(String ma, long sl) {
        this.ma = ma;
        this.sl = sl;
        if(ma.contains("BP")) hang = "British Petro";
        if(ma.contains("ES")) hang = "Esso";
        if(ma.contains("SH")) hang = "Shell";
        if(ma.contains("CA")) hang = "Castrol";
        if(ma.contains("MO")) hang = "Mobil";
        if(ma.contains("TN")) hang = "Trong Nuoc"; 
        if(ma.startsWith("X")){
            donGia = 128000;
            thue = Math.round((donGia * sl * 3)/100);
        } 
        if(ma.startsWith("D")){
            donGia = 11200;
            thue = Math.round(donGia * sl * (3.5) /100);
        }
        if(ma.startsWith("N")){
            donGia = 9700;
            thue = Math.round(donGia * sl * 2/100);
        }
//        System.out.println(donGia);
//        System.out.println(sl);
//        System.out.println(donGia * sl * 2 /100);
        if(ma.contains("TN")) thue = 0;
        sum = donGia * sl + thue;
        

    }

    @Override
    public String toString() {
        return ma + " " + hang + " " + donGia + " " + thue + " " + sum;
    }

    @Override
    public int compareTo(xd o) {
        return Long.compare(o.sum, sum);
    }
    
    
}
public class quan_ly_kho_xang_dau {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<xd> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int  i= 0; i <t;i++){
            arr.add(new xd(sc.next(), Long.parseLong(sc.next())));
        }
        Collections.sort(arr);
        for(int i =0 ; i <t;i++){
            System.out.println(arr.get(i));
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600