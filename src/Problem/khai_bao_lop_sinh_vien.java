package Problem;

import java.util.Scanner;

public class khai_bao_lop_sinh_vien {
    public static String chuan_hoa_ngay_sinh(String birth){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String clas = sc.nextLine();
        String birth = sc.nextLine();
        float gpa = sc.nextFloat();
        System.out.println("B20DCCN001 " + name + " " + clas + " " + chuan_hoa_ngay_sinh(birth) + " " + String.format("%.2f", gpa));

    }
}
