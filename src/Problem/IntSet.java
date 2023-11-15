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
public class IntSet {
    private TreeSet<Integer> set;

    public IntSet(int[] a) {
        this.set = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            this.set.add(a[i]);
        }
    }
    
    public IntSet(TreeSet<Integer> set){
        this.set = set;
    }
    
    public IntSet intersection(IntSet another){
        TreeSet<Integer> res = new TreeSet<>();
        for(int x : this.set){
            if(another.set.contains(x)) res.add(x);
        }
        return new IntSet(res);
    }
    public IntSet union(IntSet another){
        for(int x : another.set){
            this.set.add(x);
        }
        return this;
    }

    @Override
    public String toString() {
        String res = "";
        for(int x : this.set){
            res += x + " ";
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int [m];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m ; i++){
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
        
    }
    
}
