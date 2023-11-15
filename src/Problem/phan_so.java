package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.gcd(b);
        System.out.println(a.divide(c) + "/" + b.divide(c));
    }
}
