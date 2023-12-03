package Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Long n = sc.nextLong();
            Long k = sc.nextLong();
            Map<Long, Long> mp = new HashMap<>();
            Long [] a = new Long[1000001];
            for(int i = 0; i < n;i++){
                a[i] = sc.nextLong();
                if(mp.containsKey(a[i])){
                    mp.put(a[i], mp.get(a[i]) +1);
                }else{
                    mp.put(a[i], 1L);
                }
            }
            Long cnt = 0L;
//            System.out.println(n);
//            System.out.println(k);

            for(int  i = 0; i < n ;i++){
                if(mp.containsKey(k-a[i])) {
                    cnt += mp.get(k - a[i]);
                    if (a[i] * 2 == k) cnt--;
                }
            }
            System.out.println(cnt/2);
        }

    }
}
