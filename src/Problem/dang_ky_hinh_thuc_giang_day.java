package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class dang_ky_hinh_thuc_giang_day {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<mhh> arr = new ArrayList<>();
        for(int i = 0 ; i < n;i++){
            arr.add(new mhh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i= 0; i < n; i++){
            if(!arr.get(i).getTh().equals("Truc tiep"))
            System.out.println(arr.get(i));
        }
    }
}

class mhh implements Comparable<mhh>{
    String ma, sub, tc, lt, th;

    public mhh(String ma, String sub, String tc, String lt, String th) {
        this.ma = ma;
        this.sub = sub;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }

    public String getTh() {
        return th;
    }

    @Override
    public String toString() {
        return ma + " "+ sub + " " + tc + " " + lt + " " + th;
    }

    @Override
    public int compareTo(mhh mhh) {
        return this.ma.compareTo(mhh.ma);
    }
}