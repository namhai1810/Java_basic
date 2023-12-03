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
public class lua_chon_tham_lam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int d = a, c =b;
        if(9 * a < b || (b == 0 && a > 0)){
            System.out.println("-1 -1");
        }else{
            int [] lon = new int[a];
            int [] be = new int[a];
            // tim so be 
            for(int i =0 ; i<a;i++) lon[i] =0;
            int  k = a - 1;
            int e  = b - 1;
            while(e >= 9){
                lon[k] = 9;
                e -=9;
                k--;
            }
            lon[k] = e;
            lon[0] += 1;
            for(int i = 0; i < a; i++){
                System.out.printf(String.valueOf(lon[i]));
            }
            System.out.printf(" ");
            // tim so lon
            for(int i = 0; i < a; i++) be[i] = 0;
            int h = 0;
            while(b >= 9){
                be[h] = 9;
                b -=9;
                h++;
            }
            be[h] = b;
            for(int i = 0; i < d;i++){
                System.out.printf(String.valueOf(be[i]));
            }
            
            
            
        }
    }
}
