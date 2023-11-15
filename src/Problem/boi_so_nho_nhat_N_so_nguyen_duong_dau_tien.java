package Problem;

import java.util.Scanner;

public class boi_so_nho_nhat_N_so_nguyen_duong_dau_tien {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static long lcm(long a, long b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = 1;
            for(int i = 1; i <= n; i++){
                k = lcm(k, i);
            }
            System.out.println(k);
        }

    }
}
