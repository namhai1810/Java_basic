package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_sach_mon_thi {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JAVA2/src/Problem/DATA.in"));
        Scanner sc = new Scanner(new File("MONHOC.in"));

        ArrayList<mh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n ; i++) arr.add(new mh(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(arr);
        for(int i =0 ; i < n;i++){
            System.out.println(arr.get(i));
        }

    }
}
class mh implements Comparable<mh>{
    String ma, mon, type;

    public mh(String ma, String mon, String type) {
        this.ma = ma;
        this.mon = mon;
        this.type = type;
    }

    @Override
    public String toString() {
        return ma + " "+ mon + " " +type;
    }

    @Override
    public int compareTo(mh mh) {
        return this.ma.compareTo(mh.ma);
    }
}
