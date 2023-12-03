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
public class khaibao_lop_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Double a = sc.nextDouble(), b =sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
            Double e =  Math.sqrt((a-c) * (a-c) + (b-d) *(b-d));
            System.out.printf("%.4f%n", e);
            System.out.println("");
        }

        
    }
}
