package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class hieu_hai_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String s = String.valueOf(a.subtract(b).abs());
            int max = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while(s.length() < max){
                s = "0" + s;
            }
            System.out.println(s);
        }

    }
}
