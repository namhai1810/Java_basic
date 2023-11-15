package Problem;

import java.util.Scanner;

public class ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for(int  i = 0 ; i < t; i++){
            int dem1 = 0;
            int dem2 = 0;
            for(int j = 0; j <  3; j++){
               int x = sc.nextInt();
                if(x == 1) dem1++;
                if(x == 0) dem2++;
            }
            if(dem1 > dem2) count++;
        }
        System.out.println(count);

    }
}
