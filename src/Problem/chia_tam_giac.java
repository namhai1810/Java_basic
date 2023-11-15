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
public class chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            float n = sc.nextFloat();
            float h = sc.nextFloat();
            for(int i = 1; i < n; i++){
                System.out.printf("%.6f", Math.sqrt(((float)i / (n*1.0)) * h));
            }
            
            System.out.println();
        }
    }
}
