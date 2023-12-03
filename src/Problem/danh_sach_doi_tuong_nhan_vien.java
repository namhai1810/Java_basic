/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.*;
/**
 *
 * @author namhai18
 */
class nv implements Comparable<nv>{
    String ma,name ,gender, dob, dc, tax, dos;
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public nv(int ma, String name, String gender, String dob, String dc, String tax, String dos) {
        this.ma = String.format("%05d", ma);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dc = dc;
        this.tax = tax;
        this.dos = dos;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + gender+ " "+ dob + " " + dc+" "+ tax +" "+dos;
    }

    @Override
    public int compareTo(nv o) {
        try {
            Date a = sdf.parse(this.dob);
            Date b = sdf.parse(o.dob);
            return a.compareTo(b);
        } catch (ParseException e) {
            return 0;
        }
        
    }
    
    
}
public class danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nv>  arr = new ArrayList<>();
        for(int i =0; i < t;i++) arr.add(new nv(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(arr);
        for(int i =0 ;i< t;i++){
            System.out.println(arr.get(i));
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011
