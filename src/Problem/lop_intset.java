/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;
import java.util.*;

/**
 *
 * @author namhai18
 */

class IntSet{
    TreeSet<Integer> a;

    public IntSet(int[] arr) {
        a = new TreeSet<>();
        for(int x : arr){
           a.add(x);
        }
    }

    @Override
    public String toString() {
        String ans = "";
        for(Integer x : a){
            ans += x;
            ans += " ";
        }
        return ans.trim();
    }
    
    public IntSet union(IntSet b){
        for(Integer x :b.a){
            this.a.add(x);
        }
        return this;
    }
    
    
}
public class lop_intset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
