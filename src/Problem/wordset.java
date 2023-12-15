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
class WordSet{
    TreeSet<String> a;
    TreeSet<String> c;

    public WordSet(String s) {
        a = new TreeSet<>();
        for(String x : s.split("\\s++")){
            a.add(x.toLowerCase());
        }
        c = new TreeSet<>(a);
    }

    public WordSet union(WordSet b){
        
        for(String x : b.a){
            a.add(x);
        }
        return this;
    }
    public String intersection(WordSet b){
        String ans = "";
        for(String x : b.a){
            if(c.contains(x.toLowerCase())){
                ans += x;
                ans += " ";
            }
        }
        return ans;
    }
    
    @Override
    public String toString() {
        String ans = "";
        for(String x : a){
            ans += x.toLowerCase();
            ans += " ";
        }
        return ans.trim();
    }
    
    
    
}
public class wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
//Lap trinh huong doi tuong
//Ngon ngu lap trinh C++