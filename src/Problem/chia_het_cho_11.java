/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = BigInteger.valueOf(11);
//            System.out.println(c[0] + " " + c[1]);
            if(a.mod(b).equals(BigInteger.ZERO)) System.out.println("1");
            else System.out.println("0");
        }
    }
}
