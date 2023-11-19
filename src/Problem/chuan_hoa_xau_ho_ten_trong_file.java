package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class chuan_hoa_xau_ho_ten_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String res = sc.nextLine();
            if(res.equals("END")){
                break;
            }
            String k = res.trim().toLowerCase();
            String [] arr = k.split("\\s+");
            String ans = "";
            for(int i = 0 ; i < arr.length;i++){
                ans += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
                ans += " ";
            }
            System.out.println(ans.trim());

        }

    }
}
