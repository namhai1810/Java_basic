package Problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class so_loc_phat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            ArrayList<String> arr = new ArrayList<>();
            q.add("6");
            q.add("8");
            arr.add("6");
            arr.add("8");
            String s1 ="";
            String s2 = "";
            while(true){
                s1 = q.peek(); q.remove();
                s2 = q.peek(); q.remove();
                if(s1.length() == n && s2.length() == n) break;

                q.add(s1 + "6");
                q.add(s1 + "8");
                arr.add(s1 + "6");
                arr.add(s1 + "8");

                q.add(s2 + "6");
                q.add(s2 + "8");
                arr.add(s2 + "6");
                arr.add(s2 + "8");
            }
            System.out.println(arr.size());
            for(int i = arr.size() - 1;i >= 0; i--){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
