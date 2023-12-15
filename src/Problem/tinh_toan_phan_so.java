/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class tinh_toan_phan_so {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b){
        return(a*b)/ gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
            long h = a * c;
            long e = b * d;
            long k = gcd(h, e);
            long tu = (long) Math.pow(a*d + b*c,2);
            long mau = (long) Math.pow(b*d, 2);
            long mark = gcd(tu, mau);
            tu /= mark;
            mau /= mark;
            System.out.printf(tu + "/" + mau);
            long tu2 = h * tu;
            long mau2 = e * mau;
            System.out.printf(" " + tu2/gcd(tu2, mau2) + "/" + mau2/(gcd(tu2, mau2)));
            System.out.println();
        }
    }
}
