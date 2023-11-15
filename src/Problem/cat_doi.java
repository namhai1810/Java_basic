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
public class cat_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n > 0){
            n--;
            String a = sc.nextLine();
            String ans = "";
            int mark = 1;
            for(int i = 0; i < a.length(); i++){
                char c = a.charAt(i);
                if(ans.equals("")){
                    if(c== '8' || c== '9'|| c == '0'){
                        continue;
                    }
                    else if(c == '1') ans+= "1";
                    else{
                        mark = 0;
                        System.out.println("INVALID");
                        break;
                    }
                }
                else{
                    if(c== '8' || c== '9'|| c == '0'){
                        ans +="0";
                    }
                    else if(c == '1') ans+= "1";
                    else{
                        mark = 0;
                        System.out.println("INVALID");
                        break;
                    }
                }
            }
            if(ans.equals("") && mark == 1)   System.out.println("INVALID");

            else if(mark == 1){
                System.out.println(ans);
            }
        } 
        
    }
}
