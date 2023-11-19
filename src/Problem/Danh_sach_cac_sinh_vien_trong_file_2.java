package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Danh_sach_cac_sinh_vien_trong_file_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int  n = Integer.parseInt(sc.nextLine());
        ArrayList<sv1> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new sv1(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr.get(i));
        }

    }
}
class sv1{
    public String masv,name,dob,cl;
    float gpa;

    public sv1(int masv, String name, String cl,String dob, float gpa) {
        this.masv = String.format("B20DCCN%03d", masv);
        this.name = name;
        this.cl = cl;
        this.dob = dob;
        this.gpa = gpa;
    }
    public String xulyb(String dob){
        StringBuilder sb = new StringBuilder(dob);
        if(sb.charAt(1) == '/') sb.insert(0,"0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    @Override
    public String toString() {
        return masv + " " + name + " "+ cl + " " +xulyb(dob) + " "+String.format("%.2f", gpa);
    }
}
