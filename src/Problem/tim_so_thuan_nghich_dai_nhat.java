package Problem;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class tim_so_thuan_nghich_dai_nhat {
    public static boolean check_tn(String n){
        for(int i= 0; i < n.length()/2;i++){
            if(n.charAt(i) != n.charAt(n.length() - i -1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new File("DATA.in"));
        Map<String, Integer> mp = new LinkedHashMap<>();
        int ans = 0;
        while(sc.hasNext()){
            String k = sc.next();
            if(check_tn(k)){
                if(k.length() >= ans){
                    ans = k.length();
                    if(mp.containsKey(k)){
                        mp.put(k,mp.get(k)+1 );
                    }else{
                        mp.put(k, 1);
                    }
                }
            }
        }
        for(Map.Entry<String, Integer> entry : mp.entrySet()){
            if(entry.getKey().length() == ans){
                System.out.println(entry.getKey() + " " + entry.getValue()) ;
            }
        }

    }
}
