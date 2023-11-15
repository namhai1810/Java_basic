package Problem;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        while(n-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String [] a = s.split("\\s+");
            String res = "";
            res += a[a.length -1];
            for(int i = 0; i < a.length -1; i++){
                res += a[i].charAt(0);
            }
            if(!map.containsKey(res)){
                map.put(res,1);
                System.out.println(res + "@ptit.edu.vn");
            }else{
                map.put(res, map.get(res) + 1);
                System.out.println(res + map.get(res) + "@ptit.edu.vn");
            }
        }


    }
}
