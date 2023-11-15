package Problem;

import java.io.FileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class ds implements Comparable<ds>{
    String ma, date, time,cl;

    public ds(int ma, String date, String time, String cl) {
        this.ma = String.format("C%03d", ma);
        this.date = date;
        this.time = time;
        this.cl = cl;
    }

    @Override
    public String toString() {
        return ma + " " + date + " " + time + " " + cl;
    }

    @Override
    public int compareTo(ds ds) {
        String [] arr = this.date.split("/");
        String [] arr1 = ds.date.split("/");
        String [] t = this.time.split(":");
        String [] t1 = ds.time.split(":");

        int ngay = Integer.parseInt(arr[0]);
        int ngay1 = Integer.parseInt(arr1[0]);
        int thang = Integer.parseInt(arr[1]);
        int thang1 = Integer.parseInt(arr1[1]);
        int nam = Integer.parseInt(arr[2]);
        int nam1 = Integer.parseInt(arr1[2]);
        if(nam1 != nam) return nam - nam1;
        if(thang != thang1) return thang - thang1;
        if(ngay != ngay1) return ngay - ngay1;
        int hour = Integer.parseInt(t[0]);
        int hour1 = Integer.parseInt(t1[0]);
        int mini = Integer.parseInt(t[1]);
        int mini1 = Integer.parseInt(t1[1]);
        if(hour1 != hour) return hour - hour1;
        return mini - mini1;




    }
}
public class Danh_sach_ca_thi {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JAVA2/src/Problem/DATA.in"));
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ds> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ds(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i= 0; i< n;i++) System.out.println(arr.get(i));

    }
}
