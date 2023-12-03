/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class sv{
    String ma, name, kq;
    float toan,ly,hoa, ut, tong;

    public sv(String ma, String name, float toan, float ly, float hoa) {
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        ut =0;
        if(this.ma.charAt(2) == '1') ut = (float) 0.5;
        if(this.ma.charAt(2) == '2') ut = (float) 1;
        if(this.ma.charAt(2) == '3') ut =(float) 1.5;
        this.tong = toan *2 + ly +hoa;
        if(this.tong+ ut >= 24) this.kq = "TRUNG TUYEN";
        else this.kq = "TRUOT";
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        String res = ma + " " + name + " ";
        if((int) this.ut == this.ut) res += String.format("%.0f", this.ut);
        else res += String.format("%.1f", this.ut);
        res += " ";
        if((int) this.tong == this.tong) res += String.format("%.0f", this.tong);
        else res += String.format("%.1f", this.tong);
        res+= " ";
        res += kq;
        return res;
    }
    
    
}
public class bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sv a = new sv(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            System.out.println(a);
    }
            
}

