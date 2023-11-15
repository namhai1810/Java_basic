package Problem;

import java.util.Scanner;

public class chuan_hoa_ho_ten {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String [] a = s.split("\\s+");
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
            }
            System.out.println(res);
        }

    }
}
