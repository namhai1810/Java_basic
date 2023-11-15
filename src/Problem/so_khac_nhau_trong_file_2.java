package Problem;

import java.io.IOException;
import java.io.*;
import java.util.*;
public class so_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int [] a = new int [2000];
        while(sc.hasNext()){
            String s = sc.next();
            a[Integer.parseInt(s)] +=1;
        }
        for(int i = 0; i < 2000; i++){
            if (a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
