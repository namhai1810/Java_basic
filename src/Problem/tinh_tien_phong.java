package Problem;
import java.io.*;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
class khachHang implements Comparable<khachHang>{
    String ma, name;
    String phong;
    Date den, di;
    long Duration;
    long sum;
    int phatSinh;

    public khachHang(int ma, String name, String phong, Date den, Date di,  int phatSinh) {
        this.ma = String.format("KH%02d", ma);
        this.name = name;
        this.phong = phong;
        this.den = den;
        this.di = di;
        this.phatSinh = phatSinh;
        this.Duration = getTime();
        if(this.phong.charAt(0) == '1') this.sum = this.Duration * 25;
        if(this.phong.charAt(0)== '2') this.sum = this.Duration * 34;
        if(this.phong.charAt(0)== '3') this.sum = this.Duration * 50;
        if(this.phong.charAt(0)== '4') this.sum = this.Duration * 80;
        this.sum += this.phatSinh;
    }
    
    
    public long getTime(){
        long difference = this.di.getTime() - this.den.getTime();
        return difference/(24 * 60 * 60 * 1000) +1 ;
    }
    
    
    
    @Override
    public int compareTo(khachHang o) {
        return (int) (-this.sum  + o.sum);
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + phong + " " + Duration + " " + sum;
                }
    
    
}
public class tinh_tien_phong {
    public static String DOB(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
//        System.out.println(sb.toString());
        return sb.toString();
        
    }
    public static String ten(String name){
        String k = name.trim().toLowerCase();
        String[] arr = k.split("\\s++");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(new File("DATA.in"));
          int t = Integer.parseInt(sc.nextLine());
          ArrayList<khachHang> sv = new ArrayList<>();
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          for(int i = 0; i < t;i++){
              String name = ten(sc.nextLine());
              String phong = sc.nextLine();
              Date den = sdf.parse(DOB(sc.nextLine()));
              Date di = sdf.parse(DOB(sc.nextLine()));
              int phatSinh = Integer.parseInt(sc.nextLine());
              sv.add(new khachHang(i+1, name,phong,den,di,phatSinh));
              
          }
          Collections.sort(sv);
          for(int i =0 ; i < t ;i++){
              System.out.println(sv.get(i));
          }
          
    }
}

