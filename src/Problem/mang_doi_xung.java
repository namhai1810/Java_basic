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
public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int mark = 1;
            int i = 0, j= n-1;
            while(i < j){
                if(a[i] == a[j]){
                    i++; j--;
                }else{
                    mark = 0;
                    break;
                }
            }
            if (mark == 1) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
