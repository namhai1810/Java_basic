package Problem;

import java.util.Scanner;

public class xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            if(s.equals(s1)){
                System.out.println("-1");
            }
            else{
                if(s.length() > s1.length()) System.out.println(s.length());
                else System.out.println(s1.length());
            }
        }
    }
}
