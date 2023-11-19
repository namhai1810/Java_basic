package Problem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class so_nguyen_to_lon_nhat_trong_file {
    public static boolean pr(int x){
        if(x<2) return false;
        for(int i = 2;i <=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("DATA.in");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Integer> arrayList = (ArrayList<Integer>) objectInputStream.readObject();
        int [] f = new int[1000005];
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i : arrayList){
            if(pr(i)){
                if(f[i] ==0) prime.add(i);
                ++f[i];
            }
        }
        Collections.sort(prime, Collections.reverseOrder());
        for(int i = 0; i < 10;i++){
            System.out.println(prime.get(i)+ " " + f[prime.get(i)]);
        }



    }
}
