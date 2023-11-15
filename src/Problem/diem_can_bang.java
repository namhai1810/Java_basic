package Problem;

import java.util.Scanner;

public class diem_can_bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int mark = 0;
            int check = 0;
            sum -= a[0];
            for(int i = 0 ; i < n -1; i++){
                mark += a[i];
                sum -= a[i+1];
//                System.out.println(mark + " " + sum);

                if(mark == sum){
                    check = 1;
                    System.out.println(i + 2);
                    break;
                }
            }
            if(check == 0){
                System.out.println("-1");
            }
        }
    }
}
