package Problem;

import java.util.Scanner;

public class so_dep_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int mark = 0;
            int n = s.length() - 1;
            if(s.charAt(s.length() - 1) != '8'){
                System.out.println("NO");
                continue;
            }
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                sum += Character.getNumericValue(s.charAt(i));
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
                if(mark == 0 && sum % 10 == 0) System.out.println("YES");
                else{
                    System.out.println("NO");

                }
            }
        }

    }
}
