package Problem;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class lop implements Comparable<lop>{
    String ma,name,tc;

    public lop(String ma, String name, String tc) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
    }


    @Override
    public int compareTo(lop lop) {
        return this.name.compareTo(lop.name);
    }

    @Override
    public String toString() {
        return ma + " " + name+  " " + tc;
    }
}
public class danh_sach_mon_hoc {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<lop> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new lop(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(int i =0 ; i < n; i++){
            System.out.println(a.get(i));
        }
    }
}
