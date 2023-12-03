/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author namhai18
 */
public class bo_ba_so_pytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            TreeMap<Long, Long> mp = new TreeMap<>();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i =0 ; i < n;i ++){
                Long e = sc.nextLong();
                arr.add(e * e);
            }
            Collections.sort(arr);
            int mark = 0;
            for(int i = n -1; i >= 2; i--){
                int l = 0, r = i;
                while(l < r){
                    if(arr.get(r) + arr.get(l) == arr.get(i)){
                        mark = 1;
                        break;
                    }else{
                        if(arr.get(l) + arr.get(r) < arr.get(i)) l++;
                        else r--;
                    }
                }
                if(mark == 1) break;
            }
            if(mark == 1) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
