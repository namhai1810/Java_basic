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
class mh implements Comparable<mh>{
    String ma, name, lop , gv;

    public mh(String ma, String name, String lop, String gv) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.gv = gv;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + lop;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }
    
    
    @Override
    public int compareTo(mh o) {
        if(!ma.equals(o.ma)){
            return ma.compareTo(o.ma);
        }
        return Integer.parseInt(lop) - Integer.parseInt(o.lop);
    }
    
}
public class lop_hoc_phan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int  i= 0; i <t;i++){
            arr.add(new mh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s =sc.nextLine();
            int mark = 1;
            for(int i =0 ; i <t;i++){
                if(arr.get(i).gv.equals(s)){
                    if(mark == 1){
                        System.out.println("Danh sach cho giang vien " + arr.get(i).gv + ":");
                        mark =0;
                    }
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}
//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//Nguyen Binh An