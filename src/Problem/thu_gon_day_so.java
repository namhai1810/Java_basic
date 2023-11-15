package Problem;

import java.util.Scanner;
import java.util.Stack;

public class thu_gon_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(st.empty()){
                st.push(a[i]);
            } else {
                if((st.peek() + a[i]) % 2 == 0){
                    st.pop();
                } else {
                    st.push(a[i]);
                }
            }
        }
        System.out.println(st.size());

    }
}
