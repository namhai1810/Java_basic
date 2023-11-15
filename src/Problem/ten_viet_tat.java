package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ten_viet_tat {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JAVA2/src/Problem/DATA.in"));
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<svi> arr = new ArrayList<>();
        for(int i = 0; i < n;i++){
            arr.add(new svi(sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        Collections.sort(arr);
        while(q-- > 0){
            String k = sc.nextLine();
            k += ".";
            for(int i =0 ; i < n; i++){
                String e = arr.get(i).getName();
                int cnt = 0;
                if(k.length() == e.length()) {
                    for (int j = 0; j < k.length(); j++) {
                        if (e.charAt(j) != k.charAt(j)) cnt += 1;
                    }
                    if (cnt == 1) {
                        System.out.println(arr.get(i));
                    }
                }
            }

        }
    }
}
class svi implements Comparable<svi>{
    String name;

    public svi(String name) {
        this.name = name;
    }
    public String xulyten(String name){
        String res = "";
        String k = name.trim().toLowerCase();
        String [] arr = k.split("\\s+");
        for(int i =0 ; i < arr.length; i++){
            res += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " ";
        }
        return res;

    }

    public String getName() {
        String k = xulyten(name);
        String [] arr = k.split(" ");
        String res = "";
        for(int i = 0; i < arr.length;i++){
            res += arr[i].substring(0,1).toUpperCase();
            res += ".";
        }
        return res;
    }

    @Override
    public String toString() {
        return xulyten(name);
    }

    @Override
    public int compareTo(svi sv) {
        String [] arr = this.name.split(" ");
        String [] arr1 = sv.name.split(" ");
        if(!arr[2].equals(arr1[2])){
            return arr[2].compareTo(arr1[2]);
        }
        return arr[0].compareTo(arr1[0]);
    }
}