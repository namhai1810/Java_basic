/**
 *
 * @author namhai18
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;
import java.util.*;
/**
 *
 * @author namhai18
 */
class sv implements Comparable<sv>{
    String ma, name, lop, mail;

    public sv(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public int compareTo(sv o) {
//        if(!o.lop.equals(this.lop)){
//            return this.lop.compareTo(o.lop);
//        }
        return this.ma.compareTo(o.ma);
        
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString() {
        return ma+" " + name + " "+ lop +" "+ mail;
    }
    
}
public class liet_ke_sinh_vien_theo_lop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i =0; i < t;i++){
            arr.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
//        Collections.sort(arr);
        while(q-- > 0){
            String k = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + k+":");
            for(int i =0; i<t;i++){
                if(arr.get(i).getLop().equals(k)){
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B