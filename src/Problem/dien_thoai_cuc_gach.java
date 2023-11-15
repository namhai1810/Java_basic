package Problem;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class dien_thoai_cuc_gach {


        public static void main(String[] args) {
            // Tạo một từ điển tương ứng giữa số và ký tự
            Map<Character, Character> charToNum = new HashMap<>();
            charToNum.put('A', '2');
            charToNum.put('B', '2');
            charToNum.put('C', '2');
            charToNum.put('D', '3');
            charToNum.put('E', '3');
            charToNum.put('F', '3');
            charToNum.put('G', '4');
            charToNum.put('H', '4');
            charToNum.put('I', '4');
            charToNum.put('J', '5');
            charToNum.put('K', '5');
            charToNum.put('L', '5');
            charToNum.put('M', '6');
            charToNum.put('N', '6');
            charToNum.put('O', '6');
            charToNum.put('P', '7');
            charToNum.put('Q', '7');
            charToNum.put('R', '7');
            charToNum.put('S', '7');
            charToNum.put('T', '8');
            charToNum.put('U', '8');
            charToNum.put('V', '8');
            charToNum.put('W', '9');
            charToNum.put('X', '9');
            charToNum.put('Y', '9');
            charToNum.put('Z', '9');
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            while (n-- > 0) {
                String s = sc.nextLine();
                s = s.trim();
                s = s.toUpperCase();
                String res = "";
                for (int i = 0; i < s.length(); i++) {
                    res += charToNum.get(Character.toUpperCase(s.charAt(i)));
                }
                int mark = 0;
                int k = res.length() - 1;
                for (int i = 0; i < res.length(); i++) {

                    if (res.charAt(i) != res.charAt(k)) {
                        mark = 1;
                        break;
                    }
                    k--;
                    if (i >= k) break;
                }
                if (mark == 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }

}
