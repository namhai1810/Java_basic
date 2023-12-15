/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
class sv implements Comparable<sv>{
    String name;
    int a, c;

    public sv(String name, int a, int c) {
        this.name = name;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public int compareTo(sv o) {
        if(a != o.a) return o.a - a;
        if(c != o.c) return c - o.c;
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + " " + a + " " + c;
    }
    
    
}
public class bang_xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String [] diem = sc.nextLine().split("\\s++");
            arr.add(new sv(name, Integer.parseInt(diem[0]), Integer.parseInt(diem[1])));
        }
        Collections.sort(arr);
        for (int i = 0; i < t; i++) {
            System.out.println(arr.get(i));
        }
        
    }
}
