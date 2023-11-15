package Problem;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author namhai18
 */
public class tinh_so_fibonacii {
    public static void main(String[] args) {
        long[] a = new long [93];
        Scanner sc = new Scanner(System.in);
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < 93; i++){
            a[i] = a[i-1] + a[i-2];
        }
        int n = sc.nextInt();
        while(n>0){
            n--;
            int e = sc.nextInt();
            System.out.println(a[e-1]);
        }
        
    }
}
