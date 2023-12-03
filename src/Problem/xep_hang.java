/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author namhai18
 */
class p implements Comparable<p>{
    int fi,se;

    public p(int fi, int se) {
        this.fi = fi;
        this.se = se;
    }

    @Override
    public int compareTo(p o) {
        if(this.fi == o.fi){
            return this.se - o.se;
        }
        return this.fi - o.fi;
    }

    public int getFi() {
        return fi;
    }

    public void setFi(int fi) {
        this.fi = fi;
    }

    public int getSe() {
        return se;
    }

    public void setSe(int se) {
        this.se = se;
    }

    @Override
    public String toString() {
        return "p{" + "fi=" + fi + ", se=" + se + '}';
    }
    
    
    
    
}
public class xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<p> arr = new ArrayList<>();
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new p(a,b));
        }
        Collections.sort(arr);
        int ans = 0;
        for(int i = 0; i < t; i++){
            ans = Math.max(arr.get(i).getFi(), ans);
            ans += arr.get(i).getSe();
        }
        System.out.println(ans);
    }
}
