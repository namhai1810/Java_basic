/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author namhai18
 */

class IntSet{
    TreeSet<Integer> a;
    TreeSet<Integer> c;

    public IntSet(int[] arr) {
        a = new TreeSet<>();
        c = new TreeSet<>();

        for(int x : arr){
           a.add(x);
        }
    }

    @Override
    public String toString() {
        String ans = "";
        for(Integer x : c){
            ans += x;
            ans += " ";
        }
        return ans.trim();
    }
    

    public IntSet intersection(IntSet b){
        for(Integer x : a){
            if(b.a.contains(x)){
                c.add(x);
            }
        }
        return this;
    }
    

    
    
}
public class lop_intset2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
