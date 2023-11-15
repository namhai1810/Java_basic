package Problem;

import java.util.Scanner;

public class boi_so_chung_uoc_so_chung {
    public static long gcd(long a, long b){
        if(b == 0) {return a;}
        return gcd(b, a % b);
    }
    public static long lcm(long a, long b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt(), b = sc.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
