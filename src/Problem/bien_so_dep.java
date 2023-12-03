/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author namhai18
 */

public class bien_so_dep {
    public static boolean kiemtra(String k){
        String res = k.split("-")[1];
        String[] a = res.split("\\.");
        String ans1 = a[0] + a[1];
        int check1= 1;
        for(int i =1; i < ans1.length();i++){
            if(Character.getNumericValue(ans1.charAt(i)) - Character.getNumericValue(ans1.charAt(i-1))!=1){
                check1 = 0;
                break;
            }
        }
        int check2 = 1;
        for(int i =1; i< ans1.length();i++){
            if(ans1.charAt(i) != ans1.charAt(i-1)){
                check2 = 0;
                break;
            }
        }
        int check3 = 1;
        for(int i =1; i < a[0].length();i++){
            if(a[0].charAt(i) != a[0].charAt(i-1)){
                check3 = 0;
                break;
            }
        }
        for(int i =1; i < a[1].length();i++){
            if(a[1].charAt(i) != a[1].charAt(i-1)){
                check3 = 0;
                break;
            }
        }
        int check4 = 1;
        for(int i =0; i< ans1.length();i++){
            if(ans1.charAt(i) != '6' && ans1.charAt(i) != '8'){
                check4 = 0;
                break;
            }
        }
        if(check1 == 0 && check2 ==0 && check3 ==0 & check4 ==0) return false;
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String k = sc.nextLine();
            if(kiemtra(k)) {System.out.println("YES");}
            else System.out.println("NO");

        }
    }
}
