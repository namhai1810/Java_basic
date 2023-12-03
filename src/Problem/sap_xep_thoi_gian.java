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
class tim implements Comparable<tim>{
    int gio,phut,giay;

    public tim(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(tim o) {
        if(o.gio != this.gio) return this.gio - o.gio;
        if(o.phut != this.phut) return this.phut - o.phut;
        if(o.giay != this.giay) return this.giay - o.giay;
        return 0;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
    
    
}
public class sap_xep_thoi_gian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<tim> arr = new ArrayList<>();
        for(int i =0; i  < t;i++){
            arr.add(new tim(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        for(int i =0 ; i < t;i++){
            System.out.println(arr.get(i));
        }
    }
}
