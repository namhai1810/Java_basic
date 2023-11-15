package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danh_sach_trung_tuyen {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JavaApplication1/src/Problem/DATA.in"));
        Scanner sc = new Scanner(new File("THISINH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> students = new ArrayList<>();
        for(int i = 0; i < n; i++){
            students.add(new thiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        int k = sc.nextInt();
//        System.out.println(k);
        Collections.sort(students);
        double check = students.get(k-1).getSum();
        System.out.println(String.format("%.1f", check));
        for(int i = 0; i < n; i++){
                System.out.print(students.get(i));
            if(students.get(i).getSum() >= check){
                System.out.println("TRUNG TUYEN");
            }else{
                System.out.println("TRUOT");
            }
        }
    }


}
class thiSinh implements Comparable<thiSinh>{
    private String maSv, name;
    double toan, ly, hoa;
    double sum, cong;
    public thiSinh(String maSv, String name, double toan, double ly, double hoa) {
        this.maSv = maSv;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(maSv.charAt(2) == '1') this.cong += 0.5;
        if(maSv.charAt(2) == '2') this.cong += 1;
        if(maSv.charAt(2) == '3') this.cong += 2.5;
        this.sum = toan * 2 + ly + hoa + this.cong;

    }

    public double getSum() {
        return sum;
    }

    public String xuLyten(String ten){
        String n = ten.trim().toLowerCase();
        String[] arr = n.split("\\s+");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return res;
    }

    @Override
    public String toString() {
        return maSv + " " + xuLyten(name) + " " + (new DecimalFormat().format(cong)) + " " + (new DecimalFormat().format(sum)) + " ";

    }

    @Override
    public int compareTo(thiSinh thiSinh) {
        if(this.sum > thiSinh.sum) return -1;
        if(this.sum < thiSinh.sum) return 1;
        return maSv.compareTo(thiSinh.maSv);
    }
}
