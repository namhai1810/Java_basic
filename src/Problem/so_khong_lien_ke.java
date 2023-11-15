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
public class so_khong_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            int check = 1, sum =0;
            for(int i = 1; i < s.length(); i++){
                char c = s.charAt(i);
                char d = s.charAt(i-1);
                sum += Character.getNumericValue(c);
                if(Math.abs(Character.getNumericValue(c) - Character.getNumericValue(d)) != 2){
                    check = 0; 
                    break;
                }
            }
            sum += Character.getNumericValue(s.charAt(0));
            if(sum %10 ==0 && check == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }
}
