package Problem;

import java.math.BigInteger;
import java.util.Scanner;

public class chia_het {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO) ){
                System.out.println("YES");}
            else{
                System.out.println("NO");
            }
        }
    }
}
