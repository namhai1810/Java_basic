package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class loai_bo_so_nguyen {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String tmp =  sc.next();

            try{
                Integer x = Integer.parseInt(tmp);
            }
            catch(Exception e){
                arr.add(tmp);
            }
        }
        Collections.sort(arr);
        for(String x : arr){
            System.out.print(x + " ");
        }

    }
}
