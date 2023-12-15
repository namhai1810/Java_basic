/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class gv{
    String cv, ba;
    String name;
    int salary;
    int a,sum;
    
    
    public gv(String cv, String ba, String name, int salary) {
        this.cv = cv;
        this.ba = ba;
        this.name = name;
        this.salary = salary;
        if(cv.equals("HT")) a = 2000000;
        if(cv.equals("HP")) a = 900000;
        if(cv.equals("GV")) a =500000;
        sum = a + salary * Integer.parseInt(ba);
    }

    @Override
    public String toString() {
        return cv + ba + " " + name + " "+Integer.parseInt(ba) + " " + a + " " + sum;
    }
    
}
public class bang_thu_nhap_gv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<gv> arr = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        for(int i =0;i < t;i++){
            String k = sc.nextLine();
            String ma = k.substring(0, 2);
            String ma1 = k.substring(2);
            String name = sc.nextLine();
            int luong = Integer.parseInt(sc.nextLine());
            if(!mp.containsKey(ma)){
                mp.put(ma, 1);
            }
            else{
                if(mp.get(ma) == 1 && ma.equals("HT")) continue;
                if(mp.get(ma) == 2 && ma.equals("HP")) continue;
                mp.put(ma, mp.get(ma) +1);
            }
            arr.add(new gv(ma, ma1, name,luong));
        }
        for(int i =0; i <arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000