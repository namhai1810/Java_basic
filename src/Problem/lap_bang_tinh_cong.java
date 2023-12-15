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
class tl{
    String ma;
    String name;
    int luong, ngay;
    String cv;
    int a;
    int b,c,sum;
    public tl(int ma,String name, int luong, int ngay, String cv) {
        this.ma = String.format("NV%02d", ma);
        this.name = name;
        this.luong = luong;
        this.ngay = ngay;
        this.cv = cv;
        a = luong * ngay;
        if(this.ngay >= 25) b = a * 20/100;
        if(this.ngay >= 22 && this.ngay < 25) b = a * 10/100;
        if(cv.equals("GD")) c  = 250000;
        if(cv.equals("PGD")) c  = 200000;
        if(cv.equals("TP")) c  = 180000;
        if(cv.equals("NV")) c  = 150000;
        sum = a + b +c;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return ma + " " +name+" "+ a + " "+b+" "+ c+ " " + sum;
    }
    
    
}
public class lap_bang_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<tl> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arr.add(new tl(i+1, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
//        Collections.sort(arr);
        int sum = 0;
        for (int i = 0; i < t; i++) {
            System.out.println(arr.get(i));
        }
//        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV