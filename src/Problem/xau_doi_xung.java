package Problem;

import java.util.Scanner;

public class xau_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            int mark = 0;
            int j = s.length() -1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(j)){
                    mark++;
                    if(mark > 1){
                        break;
                    }
                }
                j--;
                if(i >= j) break;
            }
            if(mark > 1){
                System.out.println("NO");
            }else{
                if(s.length() %2 ==0 && mark == 0) System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }

    }
}
