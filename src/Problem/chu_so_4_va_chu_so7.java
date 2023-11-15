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
public class chu_so_4_va_chu_so7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                cnt++;
            }
        }
        if(cnt == 7 || cnt == 4) System.out.println("YES");
        else System.out.println("NO");
        
        
    }
}
