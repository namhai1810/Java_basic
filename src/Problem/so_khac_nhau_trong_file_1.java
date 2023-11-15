package Problem;
import java.util.*;
import java.io.*;
public class so_khac_nhau_trong_file_1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        while(sc.hasNext()){
           String s = sc.next();
           Integer m = Integer.parseInt(s);
           if (map.containsKey(m)){
               map.put(m, map.get(m) + 1);
           }
           else {
               map.put(m, 1);
           }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
