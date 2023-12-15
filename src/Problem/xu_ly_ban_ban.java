/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class xu_ly_ban_ban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        while(sc.hasNextLine()){
            a += sc.nextLine();
        }
        String [] arr = a.split("[.?!]");
        for(String x : arr){
            x = x.trim();
            x = x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase();
            for(String k : x.split("\\s++")){
                System.out.printf(k +" ");
            }
            System.out.println();
        }
    }
}
