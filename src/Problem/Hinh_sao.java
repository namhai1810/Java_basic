package Problem;

import java.util.Scanner;

public class Hinh_sao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [100006];
        for(int i = 0; i < n-1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x]++;
            arr[y]++;
        }
        int m = 0;
        for(int i = 0; i < 100006;i++){
            if(arr[i] > 2 ) m++;
        }
        if(m < 2) System.out.println("Yes");
        else System.out.println("No");


    }
}
