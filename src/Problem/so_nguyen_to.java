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
public class so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n> 0){
            n--;
            int mark = 1;
            long k = sc.nextLong();
            for(int i = 2; i <= Math.sqrt(k); i++){
                if(k %i == 0){
                    mark = 0;
                    break;
                }
            }
            if(mark == 0) System.out.println("NO");
            else System.out.println("YES");
        }
        
        
    }
}
