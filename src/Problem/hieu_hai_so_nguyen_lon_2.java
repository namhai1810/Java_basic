package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class hieu_hai_so_nguyen_lon_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        System.out.println(a.subtract(b));
    }
}
