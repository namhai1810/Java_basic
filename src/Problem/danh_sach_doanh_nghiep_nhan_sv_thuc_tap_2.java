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
class dn implements Comparable<dn> {

    String id, name;
    int sv;
    
    public dn(String id, String name, int sv) {
        this.id = id;
        this.name = name;
        this.sv = sv;
    }
    
    @Override
    public int compareTo(dn o) {
        if (o.sv != this.sv) {
            return o.sv - this.sv;
        }
        return this.id.compareTo(o.id);
    }

    public int getSv() {
        return sv;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + sv;
    }
    
}

public class danh_sach_doanh_nghiep_nhan_sv_thuc_tap_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<dn> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arr.add(new dn(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        int k = Integer.parseInt(sc.nextLine());
        while(k-- > 0 ){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (int i = 0; i < t; i++) {
                if(arr.get(i).getSv() >= a && arr.get(i).getSv() <= b){
                    System.out.println(arr.get(i));
                }
            }
        }
        
        
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
