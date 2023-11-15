package Problem;

import java.util.Scanner;

public class so_dep_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int mark = 0;
            int n = s.length() - 1;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c != '2' && c != '3' && c != '5' && c != '7'){
                    mark = 1;
                    break;
                }
                if(s.charAt(i) != s.charAt(n)){
                    mark = 1;
                    break;
                }
                n--;
                if(i >= n) break;
            }
            if(mark == 1) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
