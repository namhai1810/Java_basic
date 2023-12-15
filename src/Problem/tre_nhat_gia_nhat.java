/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author namhai18
 */
class ng implements Comparable<ng>{
    String name;
    Date dob;

    public ng(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public int compareTo(ng o) {
        return this.dob.compareTo(o.dob);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
public class tre_nhat_gia_nhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<ng> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i =0; i < t;i++){
            String res = sc.nextLine();
            String [] k =res.trim().split("\\s++");
//            System.out.println(k[1]);
            Date h = sdf.parse(k[1]);
//            System.out.println(h);
            arr.add(new ng(k[0], h));
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
        System.out.println(arr.get(0));
    }
    
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990