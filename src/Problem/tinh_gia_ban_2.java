/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class tap_hoa implements Comparable<tap_hoa>{
    String ma, name,loai;
    float gia, sl;
    float a,b,c;
    public tap_hoa(int ma, String name, String loai,float gia, float sl) {
        this.ma = String.format("MH%02d", ma);
        this.name = name;
        this.loai = loai;
        this.gia = gia;
        this.sl = sl;
        float k = gia  * sl;
        this.a = Math.round(k * 5/100);
        this.b = Math.round(k + this.a);
        if(((this.b +  this.b* 2/100)/sl)%100 != 0)
         this.c = Math.round((this.b +  this.b* 2/100)/sl + 100-((this.b +  this.b* 2/100)/sl)%100 );
        else{
            this.c = Math.round((this.b +  this.b* 2/100)/sl);
        }
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + loai +" " + (int)a + " " + (int)b +" "+ (int)c;
    }

    @Override
    public int compareTo(tap_hoa o) {
        return (int)(o.c - this.c);
    }
    
    
    
    
}
public class tinh_gia_ban_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<tap_hoa> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new tap_hoa(i+1,sc.nextLine(),sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr);
        for(int i = 0; i < n ;i++){

            System.out.println(arr.get(i));
        }        
    }
    
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430