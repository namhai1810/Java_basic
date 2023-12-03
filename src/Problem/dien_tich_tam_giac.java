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

public class dien_tich_tam_giac {
    public static double dis(double a, double b, double c, double d){
        return Math.sqrt(Math.pow(a-c,2) + Math.pow(b-d, 2));
    } 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            double AB = dis(a,b,c,d);
            double AC = dis(a,b,e,f);
            double BC = dis(c, d, e, f);
//            System.out.println(AB + " " + AC + " " + BC);
            double m = Math.max(AB, Math.max(AC, BC));
            if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB) System.out.println("INVALID");
            else{
                double k =  Math.sqrt((AB + AC + BC) * (AB + AC - BC) * (AC + BC - AB) * (BC + AB - AC)) /4;
                System.out.println(String.format("%.2f", k));
            }
            
        }
    }
}
