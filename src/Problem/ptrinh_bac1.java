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
public class ptrinh_bac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            System.out.printf("%.2f", -b / a);
        }

    }
}