package Problem;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class xet_tuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JavaApplication1/src/Problem/DATA.in"));
//        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sinhVien> students = new ArrayList<>();
        for(int i = 0; i < n; i++){
            students.add(new sinhVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(int i = 0; i < n; i++){
            String h = String.valueOf(i+1);
            while(h.length() <= 1){
                h = "0" + h;
            }
            System.out.print("PH" + h + " ");
            System.out.println(students.get(i));
        }

    }
}

class sinhVien{
    private String name;
    private String birth;
    private double lt, th,tb;
    private String status;

    public sinhVien(String name, String birth, double lt, double th) {
        this.name = name;
        this.birth = birth;
        this.lt = lt;
        this.th = th;
        this.tb = (this.lt + this.th) /2;
        if(lt >= 8 && th >= 8) this.tb += 1;
        else if(lt >= 7.5 && th >= 7.5) this.tb += 0.5;
        long e =  Math.round(this.tb);

        if(e >= 9) this.status = "Xuat sac";
        else if(e >= 8) this.status = "Gioi";
        else if(e >= 7) this.status = "Kha";
        else if(e >= 5) this.status = "Trung binh";
        else this.status = "Truot";
    }
    public String xuLyTen(String name){
        String n = name.trim().toLowerCase();
        String [] arr = n.split("\\s+");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return res;

    }
    public String xuLyNgayThang(String birth){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        return sb.toString();
    }
    @Override
    public String toString() {
        String k = xuLyNgayThang(birth);
        int n = Integer.parseInt(k.substring(6));
        long e =  Math.round(this.tb);
        if(e > 10) e = 10;

        return xuLyTen(name) + (2021 - n) + " " + e + " "+ status;
    }
}