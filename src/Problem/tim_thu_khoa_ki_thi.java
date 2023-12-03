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
class sv1 implements Comparable<sv1>{
    String ma, name,dob;
    float a,b,c, sum;

    public sv1(int ma, String name, String dob, float a, float b, float c) {
        this.ma = String.valueOf(ma);
        this.name = name;
        this.dob = dob;
        this.a = a;
        this.b = b;
        this.c = c;
        this.sum = this.a + this.b + this.c;
    }

    public float getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return ma +" " + name + " " + dob + " " + sum;
    }

    @Override
    public int compareTo(sv1 o) {
        return Float.compare(o.sum, this.sum);
    }    
}
public class tim_thu_khoa_ki_thi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv1> arr = new ArrayList<>();
        for(int i =0 ; i < t;i++) 
            arr.add(new sv1(i+1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        Collections.sort(arr);
        System.out.println(arr.get(0));
        for(int i =1 ; i<t;i++){
            if(arr.get(i).getSum() == arr.get(i -1).getSum())
            System.out.println(arr.get(i));
        }
    }
}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5