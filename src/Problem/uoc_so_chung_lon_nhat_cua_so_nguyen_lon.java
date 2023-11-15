package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class uoc_so_chung_lon_nhat_cua_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0){
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            System.out.println(a.gcd(b));
        }

    }
}
