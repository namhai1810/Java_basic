package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ten implements Comparable<ten>{
    String name;

    public ten(String name) {
        this.name = xulyten(name);
    }
    public String xulyten(String name){
        String res ="";
        String k = name.trim().toLowerCase();
        String [] arr = k.split("\\s+");
        for(int i= 0; i < arr.length; i++){
            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            res += " ";
        }
//        System.out.println(res);
        return res.trim();
    }

    @Override
    public int compareTo(ten ten) {
        String[] name1 = this.name.split("\\s+");
        String[] name2 = ten.name.split("\\s+");
        if(!name1[name1.length - 1].equals(name2[name2.length - 1])){
            return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
        }
        if(!name1[0].equals(name2[0])){
            return name1[0].compareTo(name2[0]);
        }
        // String k1 = "";
        // String k2 = "";
        // for(int i = 1; i < name1.length -1; i++) k1 += name1[i];
        // for(int i = 1; i < name2.length -1; i++) k2 += name2[i];
        // return k1.compareTo(k2);
        return this.name.compareTo(ten.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
public class chuan_hoa_va_sap_xep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<ten> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            arr.add(new ten(sc.nextLine()));
        }
        Collections.sort(arr);
        for(int i= 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}