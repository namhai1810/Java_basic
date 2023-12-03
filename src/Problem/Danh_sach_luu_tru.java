/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author namhai18
 */
class khach implements Comparable<khach>{
    String id, name, soPhong;
    Date den, di;
    long getDuration;
    public khach(int id, String name, String soPhong, Date den, Date di) {
        this.id = String.format("KH%02d",id);
        this.name = name;
        this.soPhong = soPhong;
        this.den = den;
        this.di = di;
        this.getDuration = time();
    }
    public long time(){
        long difference = this.di.getTime() - this.den.getTime();
        return difference/(24 * 60 * 60 * 1000);
    }

    @Override
    public int compareTo(khach o) {
        // nen chuyen sang long truoc khi tru roi moi ve int
        return (int) (o.getDuration - this.getDuration);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + soPhong + " " + getDuration;
    }
}
public class Danh_sach_luu_tru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<khach> arr = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            String name = sc.nextLine();
            String soPhong = sc.nextLine();
            Date den = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
            Date di = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

            arr.add(new khach(i + 1, name, soPhong, den, di));
        }
        Collections.sort(arr);
        for(int i = 0; i < n ;i++){
            System.out.println(arr.get(i));
        }
    }
}
