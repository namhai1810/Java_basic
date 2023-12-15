/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author namhai18
 */
public class phan_tich_thua_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        while(a != t){
            int n = sc.nextInt();
            TreeMap<Integer, Integer> mp = new TreeMap<>();
            long k = (long)Math.sqrt(n);
            for(int i = 2; i <= k; i++){
                while(n % i == 0){
                    if(!mp.containsKey(i)){
                        mp.put(i, 0);
                    }
                    n/=i;
                    mp.put(i,mp.get(i) +1);
                }
            }
            System.out.printf("Test "+ (a+1) +": ");
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.printf(entry.getKey() + "(" + entry.getValue() + ") ");
            }
            if(n > 1) System.out.println(n + "(1)");
                System.out.println();
            
            a+=1;
            
        }
    }
    
}
