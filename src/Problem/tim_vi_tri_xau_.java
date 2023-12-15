/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class tim_vi_tri_xau_ {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t =Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
//            System.out.println(a);
//            System.out.println(b);
            for(int i =0; i < a.length() - b.length();i++){
               if(a.charAt(i) == b.charAt(0)){ 
                    if(a.substring(i).startsWith(b)){
                        System.out.print(i+1 + " ");
                    }
               }
            }
            System.out.println();
        }
    }
}
