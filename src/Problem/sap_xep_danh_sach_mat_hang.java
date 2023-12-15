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
class sp implements Comparable<sp>{
    String ma, name, loai;
    float mua, ban, lai;

    public sp(int ma, String name,String loai, float mua, float ban) {
        this.ma = String.valueOf(ma);
        this.loai = loai;
        this.name = name;
        this.mua = mua;
        this.ban = ban;
        this.lai =this.ban - this.mua;
    }

    @Override
    public int compareTo(sp o) {
        return Float.compare(o.lai, this.lai);
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + loai+ " " + String.format("%.2f", lai);
    }
    
    
    
}
public class sap_xep_danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sp> arr = new ArrayList<>();
        for(int i =0; i < t;i++){
            arr.add(new sp(i+1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
            
        }
        Collections.sort(arr);
        for(int i =0 ; i< t;i++){
            System.out.println(arr.get(i));
        }
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37