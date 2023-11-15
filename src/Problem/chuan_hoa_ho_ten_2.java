package Problem;

import java.util.Scanner;

public class chuan_hoa_ho_ten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String[] arr = s.split("\\s+");
            String res = "";
            for(int i = 1; i < arr.length; i++){
                if(i < arr.length - 1) {
                    res += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ";
                }
                else {
                    res += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + ", ";
                }
            }
            res += arr[0].toUpperCase();
            System.out.println(res);
        }

    }
}
