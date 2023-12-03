/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
/**
 *
 * @author namhai18
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    String loai, nameString, donGia, phi;

    public LoaiPhong(String k) {
         String [] arr = k.split("\\s+");
         loai = arr[0];
         nameString = arr[1];
         donGia = arr[2];
         phi = arr[3];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.nameString.compareTo(o.nameString);
    }

    @Override
    public String toString() {
        return  loai + " " + nameString + " " + donGia + " " + phi;
    }
    
    
    
}
public class loai_phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
