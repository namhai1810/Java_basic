/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author namhai18
 */
public class phan_tu_dau_tien_ben_phai_lon_hon {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-- > 0){
            Stack<Integer> st = new Stack<Integer>();
           int n = sc.nextInt();
           for(int i = 0; i < n; i++){
               st.push(sc.nextInt());
               
           }
            ArrayList<Integer> arr = new ArrayList<>();
            Integer k = st.peek();
            st.pop();
            arr.add(-1);
            while(!st.empty()){
                
            }
            for(int i = arr.size() -1 ; i >=0; i--){
                System.out.printf(arr.get(i) + " ");
            }
             System.out.println();
         }
        
    }
}
