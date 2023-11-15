package Problem;

import java.util.HashMap;
import java.util.*;
public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = 1;
        while(t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int [] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                } else {
                    map.put(a[i], 1);
                }
            }
            System.out.println("Test " + m + ":");
            m += 1;
            for(int i = 0; i < n; i++) {
                if(map.get(a[i]) != 0) {
                    System.out.println(a[i] + " xuat hien " + map.get(a[i]) + " lan");
                    map.put(a[i], 0);
                }
            }
        }
    }
}
