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
class sve{
    String ma, name, lop, mail;

    public sve(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return ma;
    }
    
    

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString() {
        return ma+" " + name + " "+ lop +" "+ mail;
    }
    
}
public class liet_ke_sinh_vien_theo_nganh {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<sve> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i =0; i < t;i++){
            arr.add(new sve(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String k = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + k.toUpperCase()+":");  
            if(k.toLowerCase().equals("ke toan")) k = "KT";
            if(k.toLowerCase().equals("cong nghe thong tin")) k = "CN";
            if(k.toLowerCase().equals("an toan thong tin")) k = "AT";
            if(k.toLowerCase().equals("vien thong")) k = "VT";
            if(k.toLowerCase().equals("dien tu")) k = "DT";

            for(int i =0; i<t;i++){
                String res = Character.toString(arr.get(i).getMa().charAt(5)) + Character.toString(arr.get(i).getMa().charAt(6));
//                String [] h = k.split("\\s++");
//                String e = Character.toString(h[0].charAt(0)) + Character.toString(h[1].charAt(0));
//                System.out.println(res);
//                System.out.println(k);
                if(res.toUpperCase().equals(k.toUpperCase())){
                    if(k.equals("CN") || k.equals("AT") ) {
                        if(arr.get(i).getLop().charAt(0) != 'E'){
                            System.out.println(arr.get(i));
                        }
                    }else System.out.println(arr.get(i));
                }
            }
        }
    }
}
//5
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
//B15DCAT199
//Nguyen Trong Tung
//E15CQAT02-B
//sv4@stu.ptit.edu.vn
//1
//cong nghe thong tin