/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class dn implements Comparable<dn>{
   int stt;
   String ma, name, lop, email, dng;

    public dn(int stt, String ma, String name, String lop, String email, String dng) {
        this.stt = stt;
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.dng = dng;
    }

    public String getDng() {
        return dng;
    }

    public void setDng(String dng) {
        this.dng = dng;
    }
    
    
    @Override
    public String toString() {
        return stt + " " + ma + " " + name +" " + lop +" " + email + " " + dng;
    }

    @Override
    public int compareTo(dn o) {
        return name.compareTo(o.name);
    }
    
}
public class Danh_sach_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<dn> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arr.add(new dn(i+1, sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        int k = Integer.parseInt(sc.nextLine());
        while(k-- > 0){
            String s = sc.nextLine();
            for(int i =0; i < t;i++){
                if(arr.get(i).getDng().equals(s)){
                    System.out.println(arr.get(i));
                }
            }
        }
        
    }
}
//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT