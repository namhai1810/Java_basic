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
class p{
    int x ,y;

    public p(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
public class dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int [n];
            Stack<p> st1 = new Stack<>(); 
            for(int i =0 ; i < n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = n-1;i >= 0; i--){
                st1.add(new p(a[i], 1));
            }
            Stack<p> st2 = new Stack<>();
            ArrayList<Integer> arr = new ArrayList<>();
            while(!st1.isEmpty()){
                p h = st1.peek(); st1.pop();
                if(st2.isEmpty()){
                    st2.add(new p(h.x, 1));
                    arr.add(1);
                    continue;
                }
                while(!st2.isEmpty()){
                    p k = st2.peek();
                    if(k.x <= h.x){
                        h.y += k.y;
                        st2.pop();
                    }else break;
                }
                st2.push(new p(h.x, h.y));
                arr.add(h.y);
            }
            for(int i =0 ;i < arr.size();i++){
                System.out.printf(arr.get(i)+ " ");
            }
            System.out.println();
        }
        
        
    }
}
