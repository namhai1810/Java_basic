/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author namhai18
 */
class sp implements Comparable<sp>{
    String ma, name;
    int cost, insurance;

    public sp(String ma, String name, int cost, int insurance) {
        this.ma = ma;
        this.name = name;
        this.cost = cost;
        this.insurance = insurance;
    }

    @Override
    public int compareTo(sp o) {
        if(this.cost ==  o.cost){
            return this.ma.compareTo(o.ma);
        }
        return o.cost -this.cost;
    }

    @Override
    public String toString() {
        return ma  + " " + name + " " + cost+ " " + insurance;
    }
    
    
    
}
public class Danh_sach_san_pham_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sp> arr = new ArrayList<>();
        for(int i =0 ; i < t; i++){
            arr.add(new sp(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(int i =0; i < t; i++){
            System.out.println(arr.get(i));
        }
        
    }
}
