package Problem;

import java.util.Scanner;
import java.util.TreeSet;

public class tap_tu_rieng_hai_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            String [] a = s.split("\\s+");
            String [] b = s1.split("\\s+");
            TreeSet<String> set = new TreeSet<>();
            TreeSet<String> ans = new TreeSet<>();
            for(int i = 0; i < b.length; i++){
                set.add(b[i]);
            }
            for(int i = 0; i < a.length; i++){
                if(!set.contains(a[i]) && !ans.contains(a[i])){
                    ans.add(a[i]);
                    set.add(a[i]);
                }
            }
            for(String i : ans){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
