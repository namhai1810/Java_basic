/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class vdv implements Comparable<vdv>{
    String ma, name;
    int dob, seconds1;
    Date a,b;
    String ut, tt, kq;
    int rank;
    public vdv(int ma,String name, int dob, Date a, Date b) {
        this.ma = String.format("VDV%02d", ma);
        this.name = name;
        this.dob = dob;
        this.a = a;
        this.b = b;
        int tuoi = 2021 - dob;

        seconds1 = difference(a, b);
        tt = String.format("%02d:%02d:%02d",seconds1/3600, (seconds1%3600)/60, seconds1 % 60 );
        if(tuoi < 18) ut = "00:00:00";
        if(tuoi >= 18 &&  tuoi < 25){
            ut = "00:00:01";
            seconds1 -= 1;
        }
        if(tuoi >=25 && tuoi < 32) {
            ut = "00:00:02";
            seconds1 -=2;
        }
        if(tuoi >= 32) {
            ut = "00:00:03";
            seconds1 -= 3;
        }
        kq = String.format("%02d:%02d:%02d",seconds1/3600, (seconds1%3600)/60, seconds1 % 60 );



    }
    public static int difference(Date a, Date b){
        long k = (b.getTime() - a.getTime())/1000;
        return (int) k;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSeconds1() {
        return seconds1;
    }
    
    
    @Override
    public String toString() {
        return ma + " " + name + " " + tt + " " +ut + " " + kq + " " + rank;
    }

    @Override
    public int compareTo(vdv o) {
        return seconds1 - o.seconds1;
    }
    
}
public class xep_hang_VDV_1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<vdv> arr = new ArrayList<>();
        ArrayList<vdv> arr1 = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        for(int i =0 ; i <t;i++){
            String name = sc.nextLine();
            int dob = Integer.parseInt(sc.nextLine().substring(6));
            Date den = sdf.parse(sc.nextLine());
            Date di = sdf.parse(sc.nextLine());
            vdv x = new vdv(i+1, name, dob, den,di);
            arr.add(x);
            arr1.add(x);
        }
        Collections.sort(arr1);
        int rank = 1;   
        int add = 0;
        int k = arr1.get(0).getSeconds1();
        for(vdv x : arr1){
//            System.out.println(k + " " + x.getSeconds1());
            if(k != x.getSeconds1()){
                rank += add;
                add = 1;
                x.setRank(rank);
                k = x.getSeconds1();
            }else{
                add += 1;
                x.setRank(rank);
            }
        }
        for(vdv x : arr1){
            System.out.println(x);
        }
    }
}
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30