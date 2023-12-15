/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class timing implements Comparable<timing>{
    String ma, name;
    Date st,ed;
    Long time;
    public timing(String ma, String name, Date st, Date ed) {
        this.ma = ma;
        this.name = name;
        this.st = st;
        this.ed = ed;
        this.time = (this.ed.getTime() - this.st.getTime())/1000;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + this.time/3600 + " gio " + time/60 %60+" phut";
    }
    
    
    
    @Override
    public int compareTo(timing o) {
        return Long.compare(o.time, this.time);
    }
    
    
}
public class tinh_gio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<timing> arr = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        for(int i =0 ; i < t;i++){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            Date st = sdf.parse(sc.nextLine());
            Date ed = sdf.parse(sc.nextLine());
            arr.add(new timing(ma, name, st, ed));
        }
        Collections.sort(arr);
        for(int i =0; i < t;i++){
            System.out.println(arr.get(i));
        }
        
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00