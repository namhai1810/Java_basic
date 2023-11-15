/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class diem_tuyen_sinh {
       public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JAVA2/src/Problem/DATA.in"));
        Scanner sc = new Scanner(new File("THISINH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sv> arr = new ArrayList<>();
        for(int i = 0; i < n;i++){
            arr.add(new sv(i+1 , sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i = 0 ;i < n; i++){
            System.out.println(arr.get(i));
        }   
        
    }
}
class sv implements Comparable<sv>{
    String masv;
    String name;
    float diem;
    String dt,kv;
    String ketqua;

    public sv(int masv, String name, float diem, String dt, String kv) {
        this.masv = String.format("TS%02d", masv);
        this.name = name;
        this.diem = diem;

        this.dt = dt;
        this.kv = kv;
        if(kv.equals("1")) this.diem += 1.5;
        if(kv.equals("2")) this.diem += 1;
        if (!dt.equals("Kinh")) this.diem += 1.5;
        if(this.diem >= 20.5) this.ketqua = "Do";
        else this.ketqua = "Truot";
    }
    public String xulyten(String name){
        String res = "";
        String k = name.trim().toLowerCase();
        String [] arr = k.split("\\s+");
        for(int i =0 ; i < arr.length; i++){
            res += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " ";
        }
        return res;
        
    }
    
    @Override
    public String toString() {
        return masv + " " +xulyten(name)+ String.format("%.1f", diem) + " " + ketqua;
    }
    
    @Override
    public int compareTo(sv o) {
        if(this.diem == o.diem){
            return this.masv.compareTo(o.masv);
        }
        return Float.compare(o.diem, this.diem);
    }
    
    
}
