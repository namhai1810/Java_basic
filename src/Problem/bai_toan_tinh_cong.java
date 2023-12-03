/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class gv{
    String name, cv;
    int job, day;
    int luongThang, thuong, thuNhap, sum;
    public gv(String name, int job, int day, String cv) {
        this.name = name;
        this.job = job;
        this.day = day;
        this.cv = cv;
        this.luongThang = this.job * this.day;
        this.thuong = 0;
        if(day >= 25) this.thuong = this.luongThang * 20/100;
        if(day >=22 && day < 25) this.thuong = this.luongThang * 10/100;
        if(this.cv.equals("GD")) this.thuNhap = 250000;
        if(this.cv.equals("PGD")) this.thuNhap = 200000;
        if(this.cv.equals("TP")) this.thuNhap = 180000;
        if(this.cv.equals("NV")) this.thuNhap = 150000;
        this.sum = this.luongThang + this.thuNhap + this.thuong;

    }

    @Override
    public String toString() {
        return "NV01" + " " + name + " " + this.luongThang + " " + this.thuong+" "+ this.thuNhap + " " +this.sum;
    }
    
    
}
public class bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gv  a = new gv(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(a);
       
    }
}
//Bui Thi Trang
//45000
//23
//PGD