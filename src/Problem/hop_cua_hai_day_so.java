/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author namhai18
 */
public class hop_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int [m];
        TreeSet<Integer> t = new TreeSet<Integer>();

        for(int i = 0; i < n; i++){
            t.add(sc.nextInt());
        }
        
        for(int i = 0; i < m; i++){
            t.add(sc.nextInt());
        }
        for(Integer e : t){
            System.out.print(e + " ");
        }
        
    }
    
}
