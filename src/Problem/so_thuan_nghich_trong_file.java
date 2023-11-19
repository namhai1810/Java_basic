package Problem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.*;
public class so_thuan_nghich_trong_file {
    public static boolean check(int n){
        String res = Integer.toString(n);
        if(res.length() %2 ==0 || res.length() == 1) return false;
        for(int i =0; i < res.length();i++){
            if(res.charAt(i) % 2 == 0) return false;
            if (res.charAt(i) != res.charAt(res.length() - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr = new ArrayList<>((ArrayList) sc.readObject());
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = new ArrayList<>((ArrayList) sc.readObject());
        Set<Integer> s1 = new TreeSet<>(arr);
        Set<Integer> s2 = new TreeSet<>(arr2);
        ArrayList<Integer> num = new ArrayList<>();
        for(Integer t : s1){
            if(s2.contains(t) && check(t)){
                num.add(t);
            }
            if(num.size() ==10) break;
        }
        for (int i : num)
            System.out.println(i + " " + (Collections.frequency(arr, i) + Collections.frequency(arr2, i)));

    }

}
