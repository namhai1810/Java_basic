package Problem;
import java.util.*;
import java.io.*;
public class tinh_tong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long ans = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try {
                ans += Integer.parseInt(s);
            }
            catch(Exception e){}
        }
        System.out.println(ans);
    }
}
