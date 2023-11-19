package Problem;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class dn implements Comparable<dn>{
    String ma, name, hs;

    public dn(String ma, String name, String hs) {
        this.ma = ma;
        this.name = name;
        this.hs = hs;
    }

    @Override
    public int compareTo(dn dn) {
        return this.ma.compareTo(dn.ma);
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + hs;
    }
}
public class Danh_sach_doanh_nghiep {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<dn> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n; i++){
            a.add(new dn(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(int i = 0; i <n; i++){
            System.out.println(a.get(i));
        }
    }
}
