package Problem;

import java.util.Scanner;

public class so_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int chan = 0;
            int le = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i)) == false){
                    chan = 0;
                    le = 0;
                    break;
                }
                if(Character.getNumericValue(s.charAt(i)) % 2 == 0){
                    chan++;
                }else{
                    le++;
                }
            }
            if(chan == le){
                System.out.println("INVALID");
                continue;
            }
            if(chan > le){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
