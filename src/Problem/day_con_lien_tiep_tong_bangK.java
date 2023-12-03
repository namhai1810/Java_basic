/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class day_con_lien_tiep_tong_bangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong(), s = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i = 0; i < a; i++){
                arr.add(sc.nextLong());
            }
            long sum = arr.get(0), mark =0;
            int l=0, r =0;
            while(l < a){
                if(sum == s){
                    mark =1;
                    break;
                }else{
                    if(l == r || sum < s){
                       r++;
                       if(r == a) break;
                       sum += arr.get(r);
                    }else{
                        if(sum > s){
                        sum -= arr.get(l);
                        l++;
                        }
                    }
                }
            }
            
            
            if(sum == s || mark ==1) System.out.println("YES");
            else System.out.println("NO");
            
            
            
        }
        
    }
    
}
