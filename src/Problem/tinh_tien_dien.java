/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;
import java.util.*;
import java.io.*;
/**
 *
 * @author namhai18
 */
class ele implements Comparable<ele>{
    String ma,hs;
    double cu,moi;
    double a,b,c,d;
    public ele(int ma, String hs, double cu, double moi) {
        this.ma = String.format("KH%02d", ma);
        this.hs = hs;
        this.cu = cu;
        this.moi = moi;
        if(hs.equals("KD")) a = 3;
        if(hs.equals("NN")) a = 5;
        if(hs.equals("TT")) a = 4;
        if(hs.equals("CN")) a = 2;
        b = (this.moi - this.cu) * a * 550;
        double k = this.moi - this.cu;
        if(k < 50) c =0;
        if(k>=50 && k <= 100) c = b * 35/100;
        if(k>100) c = b * 100/100;
        c = Math.round(c);
        d = b + c;

    }

    public double getCu() {
        return cu;
    }

    public void setCu(double cu) {
        this.cu = cu;
    }

    public double getMoi() {
        return moi;
    }

    public void setMoi(double moi) {
        this.moi = moi;
    }
    
    @Override
    public String toString() {
        return ma  +" " + (int)a +" " + (int)b + " " + (int)c +" " + (int)d;
    }

    @Override
    public int compareTo(ele o) {
        return Double.compare(o.d, d);
    }
    
}
public class tinh_tien_dien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ele> arr = new ArrayList<>();
        for(int i =0; i < t;i++){
            arr.add(new ele(i+1, sc.nextLine() , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(int i =0 ; i<t;i++){
//            System.out.println(arr.get(i).getCu() + " " + arr.get(i).getMoi());
            System.out.println(arr.get(i));

        }
    }
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700