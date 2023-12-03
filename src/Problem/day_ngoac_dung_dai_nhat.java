package Problem;

import java.util.Scanner;
import java.util.Stack;

public class day_ngoac_dung_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Stack<Integer> st = new Stack<>();
            String s = sc.nextLine();
            st.push(-1);
            int ans = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(') st.push(i);
                else{
                    st.pop();
                    if(st.size() > 0){
                        ans = Math.max(ans , i -st.peek());
                    }
                    if(st.size() == 0){
                        st.push(i);
                    }
                }

            }
            System.out.println(ans);
        }

    }
}
