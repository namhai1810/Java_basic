package Problem;

import java.util.Scanner;
import java.util.Stack;

public class kiem_tra_day_ngoac_dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Stack<Character> st = new Stack<Character>();
            String s = sc.nextLine();
            int mark = 1;
            if(s.length()==0) {System.out.println("YES"); continue;}
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '[' || c == '{'){
                    st.push(c);
                    continue;
                }
               if(! st.empty() && c == ')' && st.peek() == '(') st.pop();
               else if(!st.empty() && c == ']' && st.peek() == '[') st.pop();
               else if (!st.empty() && c == '}' && st.peek() == '{') st.pop();
            }
            if(st.empty()){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
