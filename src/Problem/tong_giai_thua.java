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
public class tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long k = 1;
        for(int i = 1; i <= n; i++){
            k*=i;
            ans += k;
        }
        System.out.println(ans);
        
        
    }
}
