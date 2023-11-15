package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class boi_so_chung_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger c =  a.gcd(b);
            System.out.println(a.multiply(b).divide(c));
        }

    }
}
