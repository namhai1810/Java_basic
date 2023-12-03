/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.util.*;

/**
 *
 * @author namhai18
 */
class svien implements Comparable<svien>{
    String ma, name, sdt, mail;

    public svien(String ma, String name, String sdt, String mail) {
        this.ma = ma;
        this.name = name;
        this.sdt = sdt;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + sdt + " " + mail;
    }

    @Override
    public int compareTo(svien o) {
        if(o.name.equals(this.name)){
            return this.ma.compareTo(o.ma);
        }
        String [] arr1 = this.name.split(" ");
        String res1 = "";
        for(int i =0; i < arr1.length -1; i++) res1 += arr1[i];
        String [] arr2 = o.name.split(" ");
        String res2 = "";
        for(int i =0; i < arr2.length -1; i++) res2 += arr2[i];
        if(!arr2[arr2.length-1].equals(arr1[arr1.length -1])){
            return arr1[arr1.length-1].compareTo(arr2[arr2.length-1]);
        }
        return res1.compareTo(res2);
    }
    
    
    
}
public class sap_xep_danh_sach_sinh_vien {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<svien> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new svien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i =0 ; i < n ;i++){
            System.out.println(arr.get(i));
        }
    }
}
