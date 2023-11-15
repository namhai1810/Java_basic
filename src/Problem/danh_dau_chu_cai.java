package Problem;

import java.util.HashSet;
import java.util.Scanner;

public class danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
