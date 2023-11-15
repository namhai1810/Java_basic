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
public class kiem_tra_so_fibonaci {
    public static void main(String[] args) {
        long[] a = new long [93];
        Scanner sc = new Scanner(System.in);
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < 93; i++){
            a[i] = a[i-1] + a[i-2];
        }
        long n = sc.nextLong();
        while(n>0){
            n--;
            long e = sc.nextLong();
            int mark = 0;
            if(e == 0) System.out.println("YES");
            else{
            for(int i = 0; i < 92; i++){
                if(a[i] < e && a[i+1] > e){
                    break;
                }else{
                    if(a[i] == e || a[i+1] == e){
                        mark = 1; 
                        break;
                    }
                }
            }
            if(mark == 0) System.out.println("NO");
            else System.out.println("YES");
        }
        }
    }
}
