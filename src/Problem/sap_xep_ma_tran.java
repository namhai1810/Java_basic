package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sap_xep_ma_tran {
    public static void main(String[] args)  throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("MATRIX.in"));
        Scanner sc = new Scanner(new File("DATA.in"));

        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int i = Integer.parseInt(sc.next());
            int [][] arr = new int[n][m];
            int [] col = new int [n];
            for(int k=0 ;k <n; k++){
                for(int e= 0; e<m;e++){
                    arr[k][e] = Integer.parseInt(sc.next());
                    if(e==i-1){
                        col[k]= arr[k][e];
                    }
                }
            }
            Arrays.sort(col);
//            for(int h = 0; h <m;h++) System.out.println(col[h]);
            for(int k =0; k <n;k++){
                for(int e =0; e < m;e++) {
                    if (e== i-1) {
                        System.out.print(col[k] + " ");
                    } else {
                        System.out.print(arr[k][e] +" ");
                    }

                }
                System.out.println();
            }

        }
    }

}
