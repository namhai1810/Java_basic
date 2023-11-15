package Problem;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author namhai18
 */
public class so_cac_so_lquan_2va_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int mark = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '2' || c == '6'){
                mark += 1; 
            }
        }
        if(mark == 2 || mark == 6) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
