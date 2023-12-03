/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class so_0_va_so_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(true){
                String k = q.peek();    q.remove();
                if(Integer.parseInt(k) % a ==0){
                    System.out.println(k);
                    break;
                }
                q.add(k + "0");
                q.add(k + "9");
                
            }
            
            
        }
    }
}
