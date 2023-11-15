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
public class tim_hang_nguyen_to_trong_ma_tran {
    public static boolean snt(int a){
        if(a == 1 || a == 0) return false;
        if(a == 2) return true;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int e = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] a = new int [n][m];
            System.out.println("Test "+ (e+1)+":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i < n;i++){
                int mark = 1;
                for(int j = 0; j < m; j++){
                    if(snt(a[i][j]) == false){
                        mark = 0;
                        break;
                    }
                }
                if(mark == 1){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
                    e+=1;

        }
        
    }
}
