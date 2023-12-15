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
class sv implements Comparable<sv>{
    String ma, name,hk;
    float a,b,c,d,e,f,g,h,j,k;
    float tb;

    public sv(int ma, String name, float a, float b, float c, float d, float e, float f, float g, float h, float j, float k) {
        this.ma = String.format("HS%02d", ma);
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.k =k;
        // lam tron xuong
        this.tb = (this.a * 2+this.b *2+this.c+this.d+this.e+this.f+this.g+this.h+this.j+this.k)/12;
        this.tb *=10;
        this.tb = Math.round(this.tb);
        this.tb /=10;
        if(this.tb >=9) this.hk = "XUAT SAC";
        if(this.tb >=8 && this.tb <9) this.hk = "GIOI";
        if(this.tb >=7 && this.tb <8) this.hk = "KHA";
        if(this.tb >=5 && this.tb < 7) this.hk = "TB";
        if(this.tb < 5) this.hk = "YEU";
    }

    @Override
    public int compareTo(sv o) {
        if(o.tb != this.tb)
        return Float.compare(o.tb, this.tb);
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + String.format("%.1f", tb) + " " + hk;
    }
    
    
    
}
public class bang_diem_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> arr = new ArrayList<>();
        for(int i =0; i < t;i++){
            String name = sc.nextLine();
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float d = sc.nextFloat();
            float e = sc.nextFloat();
            float f = sc.nextFloat();
            float g = sc.nextFloat();
            float h = sc.nextFloat();
            float j = sc.nextFloat();
            float k = sc.nextFloat();
            sc.nextLine();
            arr.add(new sv(i+1, name, a, b, c, d, e, f, g, h, j, k));
            
        }
        Collections.sort(arr);
        for(int i =0 ; i< t;i++){
            System.out.println(arr.get(i));
        }
    }
}

//4
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8