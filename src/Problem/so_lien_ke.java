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
public class so_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
//            System.out.println(s);
            int check = 1;
            for(int i = 1; i < s.length(); i++){
                if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i-1))) != 1){
                    check = 0;
                    break;
                }
            }
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
        } 
    }
    
}
