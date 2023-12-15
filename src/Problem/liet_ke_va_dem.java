/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;
import java.util.*;
/**
 *
 * @author namhai18
 */
class p implements Comparable<p>{
    int ma, x,y;

    public p(int ma,int x, int y) {
        this.ma = ma;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return x +" " +y;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(p o) {
        if(o.y != this.y){
           return o.y - this.y;
        }
        return this.ma - o.ma;
    }
    
}
public class liet_ke_va_dem {
    public static boolean check(String s ){
        for(int i = 1; i < s.length();i++){
            if(s.charAt(i) < s.charAt(i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        int cnt =0;
        ArrayList<p> arr = new ArrayList<>();

        while(sc.hasNext()){
            String res = sc.next();
            if(check(res)){
                int s = Integer.parseInt(res);
                if(!mp.containsKey(s)){
                    mp.put(s, 1);
                    arr.add(new p(cnt, s, 1));
                    cnt += 1;
                }else {
                    mp.put(s, mp.get(s)+1); 
                    for(int i =0; i < arr.size();i++){
                        if(arr.get(i).getX() == s){
                            arr.get(i).setY(mp.get(s));
                        }
                    }
                }
//                if(s==1)  break;
            }
        }

        Collections.sort(arr);
        for(int i= 0; i < arr.size();i++){
            System.out.println(arr.get(i).getX() + " " + arr.get(i).getY());
        }
    }
}
