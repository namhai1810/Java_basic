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
public class so_tam_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            t--;
            int mark = 1;
            String s = sc.nextLine();
//            System.out.println(s);
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c != '0' && c != '1' && c != '2'){
                    mark = 0;
                    break;
                }
            }
            if (mark == 1){
                System.out.println("YES");
            }else System.out.println("NO");
        }
        
    }
}
