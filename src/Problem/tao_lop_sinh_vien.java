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
public class tao_lop_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        float  a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.printf(ma.toUpperCase() + " " + name + " " + (2023 - age) + " ");
        System.out.printf("%.1f%n", ((a + 2 *b)/3));
//        System.out.println(ma.toUpperCase() + " " + name + " ");

        
    }
}
//B21dccn123
//Le thi Teo
//20
//4.6  6