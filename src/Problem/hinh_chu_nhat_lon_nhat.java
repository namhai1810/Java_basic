/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.*;

/**
 *
 * @author namhai18
 */
public class hinh_chu_nhat_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            long ans = 0;
            Stack<Integer> st = new Stack<>();
            long [] a = new long [n];
            for(int i =0;i < n;i++){
                a[i] = sc.nextLong();
            }
            int  i = 0;
            while(i < n){
                if(st.isEmpty() || a[i] >= a[st.peek()]){
                    st.push(i);
                    i++;
                }else{
                    int idx = st.peek(); st.pop();
                    if(st.isEmpty()){
                        ans = Math.max(ans, a[idx] * i);
                    }else{
                        ans = Math.max(ans, a[idx] * (i- st.peek() - 1));
                    }
                    
                }
            }
            while(!st.isEmpty()){
                int idx = st.peek(); st.pop();
                if(st.isEmpty()){
                    ans = Math.max(ans, a[idx] * i);
                }else{
                    ans = Math.max(ans, a[idx] * (i- st.peek() - 1));
                }
                    
            }
            System.out.println(ans);
            
            
            
            
        }
        
    }
}
