package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sap_xep_mat_hang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<hangHoa> s = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String tenHang = sc.nextLine();
            String nhomHang = sc.nextLine();
            Float giaMua = Float.parseFloat(sc.nextLine());
            Float giaBan = Float.parseFloat(sc.nextLine());
            s.add(new hangHoa(i+1, tenHang, nhomHang, giaMua, giaBan));
        }
        Collections.sort(s);

        for(int i = 0; i < n; i++){
            System.out.println(s.get(i).toString());
        }
    }
}
class hangHoa implements Comparable<hangHoa>{
    String maHang;
    String tenHang;
    String nhomHang;
    float loiNhuan;

    public hangHoa(int maHang, String tenHang, String nhomHang, float giaMua, float giaBan) {
        String ma = "MH";
        if (maHang < 10) {
            ma = ma + "0" + String.valueOf(maHang);
        } else if (maHang < 100) {
            ma +=  String.valueOf(maHang);
        }
        this.maHang = ma;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return this.maHang + " " + this.tenHang + " " + this.nhomHang + " " + String.format("%.2f",this.loiNhuan);
    }
    @Override
    public int compareTo(hangHoa a){
        if(this.loiNhuan > a.loiNhuan) return -1;
        else if(this.loiNhuan < a.loiNhuan) return 1;
        else return 0;
    }
}