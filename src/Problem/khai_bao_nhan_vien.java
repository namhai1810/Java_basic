package Problem;

import java.util.Scanner;

public class khai_bao_nhan_vien {
    public static String chuan_hoa_ho_ten(String birth){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String birth = sc.nextLine();
        String home = sc.nextLine();
        String phone = sc.nextLine();
        String data = sc.nextLine();
        System.out.println("00001 " + name + " " + gender +" "+ chuan_hoa_ho_ten(birth) + " "+ home + " "+ phone + " " + chuan_hoa_ho_ten(data));

    }
}

//Nguyen Van Hoa
//Nam
//22/11/1982
//Mo Lao-Ha Dong-Ha Noi
//8333123456
//31/12/2013