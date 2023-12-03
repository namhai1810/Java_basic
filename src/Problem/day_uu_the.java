/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class day_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String [] k = sc.nextLine().trim().split("\\s++");
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =0 ; i < k.length;i++){
                arr.add(Integer.parseInt(k[i]));
            }
            int le =0, chan =0;
            for(int i=0; i < arr.size(); i++){
                if(arr.get(i) % 2 ==0) chan++;
                else le++;
            }
            if((arr.size() % 2 == 0  && chan > le) || (arr.size() % 2 != 0  && chan < le) ){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
//2
//11 22 33 44 55 66 77
//23 34 45 56 67 78 89 90 121 131 141 151 161 171