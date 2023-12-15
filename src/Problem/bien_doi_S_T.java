/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author namhai18
 */
class p{
    int a,b;

    public p(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.valueOf(b);
    }
    
    
}
public class bien_doi_S_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Queue<p> q = new LinkedList<>();
            int x = sc.nextInt(),y = sc.nextInt();
            q.add(new p(x - 1, 1));
            q.add(new p(x * 2, 1)); 
            if(x == y|| x==y){
                System.out.println(0);
                continue;
            }
            if(x -1 == y|| x * 2 ==y){
                System.out.println(1);
                continue;
            }
            Set<Integer> se = new HashSet<>();
            while (!q.isEmpty()){
                p h = q.peek(); q.remove();
                if(h.a == y){
                    System.out.println(h.b);
                    break;
                }
                if(h.a - 1 == y || h.a * 2 ==y){
                    System.out.println(h.b+1);
                    break;
                }
                if(!se.contains(h.a - 1)){
                    q.add(new p(h.a -1, h.b +1));
                    se.add(h.a-1);
                }
                if( !se.contains(h.a *2) && h.a < y) {
                    q.add(new p(h.a * 2, h.b +1));
                    se.add(h.a * 2);
                }
            }

            
            
        }
    }
}
