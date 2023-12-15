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
public class loai_bo_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int ans =0;
            for(int i =0; i < s.length() - 2;i++){
                if(s.equals("")) break;
                if(s.substring(i,i+3).equals("100")){
                    s = s.substring(0,i) + s.substring(i+3);
                    ans +=3;
                    i = Math.max(i-2, 0);
                }
            }
            System.out.println(ans);
        }
    }
}

