package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xep_loai {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JavaApplication1/src/Problem/DATA.in"));
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> students = new ArrayList<>();
        for(int i = 0; i < n; i++){
            students.add(new SV(i+1,sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(students);
        for(int i = 0; i < n ;i++){

            System.out.println(students.get(i));
        }
    }
}

class SV implements Comparable<SV>{
    String maSv, name, rank;
    float lt, th,dt;
    float result;

    public SV( int maSv, String name, float lt, float th, float dt) {
        this.maSv = String.format("SV%02d", maSv);
        this.name = name;
        this.lt = lt;
        this.th = th;
        this.dt = dt;
        this.result = (lt * 25 + th * 35 + dt * 40)/100;
        if(this.result >= 10) this.result = 10;
        if(this.result >= 8.0) this.rank = "GIOI";
        else if(this.result >= 6.5) this.rank = "KHA";
        else if(this.result >= 5.0) this.rank = "TRUNG BINH";
        else this.rank = "KEM";
    }

    public String xuLyTen(String name){
        String k = name.trim().toLowerCase();
        String [] arr = k.split("\\s+");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " ";
        }
        return res;
    }

    @Override
    public String toString() {
        return this.maSv+ " "+ xuLyTen(this.name) + String.format("%.2f", this.result) + " " + this.rank;
    }

    @Override
    public int compareTo(SV SV) {
        return Float.compare(SV.result,this.result);
    }
}