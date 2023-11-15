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
public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) {
        this.set = new TreeSet<>();
        String [] arr = s.split("\\s+");
        for(String x : arr){
            this.set.add(x);
        }
    }
    
    public WordSet union(WordSet another){
        WordSet res = new WordSet(" ");
        for(String x : another.set) res.set.add(x);
        for(String x : this.set) res.set.add(x);
        return res;
    }
    public WordSet intersection(WordSet another){
        WordSet res = new WordSet(" ");
        for(String x : another.set){
            if(this.set.contains(x)) res.set.add(x);
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for(String x : this.set){
            res += x;
            res += " ";
        }
        if(res.equals("")) return res;
        StringBuilder sb = new StringBuilder(res);
        if(sb.equals("") == false){
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
