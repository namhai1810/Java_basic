package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class tong_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        BigInteger e = a.multiply(d).add(b.multiply(c));
        BigInteger f = b.multiply(d);
        BigInteger g = e.gcd(f);
        System.out.println(e.divide(g) + "/" + f.divide(g));
    }
}
