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

class sinh implements Comparable<sinh>{
    String ma, name, lop, email;

    public sinh(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    
    @Override
    public int compareTo(sinh o) {
        return this.ma.compareTo(o.ma);
    }
    public String xulyTen(String name){
        String k = name.trim().toLowerCase();
        String [] arr = k.split("\\s++");
        String res = "";
        for(int i = 0; i < arr.length;i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " "; 
        }
        return res;
    }

    @Override
    public String toString() {
        return ma + " " + xulyTen(name) + " "  + lop + " "+ email;
    }
    
    
}
public class danh_sach_sv_trong_file1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sinh> arr = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            arr.add(new sinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i= 0; i< n; i++){
            System.out.println(arr.get(i));
        }
    }
}
