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
public class Main {
    public static String chuanHoa(String ngaySinh){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        return sb.toString();
    }
    public static String ChuanHoaTen(String ten){
        ten = ten.trim().toLowerCase();
        ten = ten.replaceAll("\\s+", " ");
        String [] temp = ten.split(" ");
        String ans = "";
        for(int i = 0; i < temp.length; i++){
            ans += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i < temp.length - 1){
                ans += " ";
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = sc.nextDouble();
            System.out.println(ten + ngaySinh + lop + gpa);
            arr[i] = new Student(i + 1  , ten, chuanHoa(ngaySinh), lop, gpa);
        }
         
        for(int i = 0; i < n; i++){
            System.out.println(arr[i].toString());
        }
    }
}
