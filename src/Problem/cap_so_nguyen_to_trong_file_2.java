package Problem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.*;
public class cap_so_nguyen_to_trong_file_2 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2;i < Math.sqrt(n);i++){
            if(n%i ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        Set<Integer> list1 = new TreeSet<>((ArrayList) sc.readObject());
        sc= new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> list2 = new TreeSet<>((ArrayList) sc.readObject());
        for(Integer i : list1){
            if(i < 1000000-i && isPrime(i) && list2.contains(1000000-i) && isPrime(1000000-i)){
                System.out.println(i+ " " + (1000000-i));
            }
        }
    }
}
