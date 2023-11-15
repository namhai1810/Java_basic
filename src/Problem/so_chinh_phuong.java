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
public class so_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n-- > 0){
            long k = sc.nextLong();
            int e = (int)Math.sqrt(k);
            if(e * e ==k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
