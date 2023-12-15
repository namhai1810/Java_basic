/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.IOError;
import java.util.*;

/**
 *
 * @author namhai18
 */

class nhan_vien{
    String ma,name, cv;
    long luong, day;
    long a,b, c, d;

    public nhan_vien(int ma,String name, String cv, long luong, long day) {
        this.ma = String.format("NV%02d", ma);
        this.name = name;
        this.cv = cv;
        this.luong = luong;
        this.day = day;
        a = 100;
        if(this.cv.equals("GD")) a = 500;
        if(this.cv.equals("PGD")) a = 400;
        if(this.cv.equals("TP")) a = 300;
        if(this.cv.equals("KT")) a = 250;
        b = this.luong * this.day;
        double k = (double) (a+b);
        if((k*2/3) < 25000){
            c = (long)Math.round(k*2/3/1000) * 1000;
        }else{
            c = 25000;
        }
        d = (a +b) -c;
    }

    public String getCv() {
        return cv;
    }
    

    @Override
    public String toString() {
        return ma + " " + name + " " + a +" " + b+" " + c +" " + d;
    }
    
}
public class liet_ke_nhan_vien_theo_chuc_vu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhan_vien> arr = new ArrayList<>();
        for(int i =0; i < t;i++){
            arr.add(new nhan_vien(i+1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
            
        }
            String s = sc.nextLine();
            for(int i = 0; i < t;i++){
                if(arr.get(i).getCv().equals(s))
                System.out.println(arr.get(i));
                }
    }
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
//TP