package Problem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<A,B>{
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }
    public boolean checkPrime(int x){
        if(x == 0 || x == 1) return false;
        for(int i = 2; i <= Math.sqrt(x);i++){
            if(x % i ==0) return false;

        }
        return true;
    }
    public boolean isPrime(){
        return checkPrime((Integer) first) && checkPrime((Integer) second);
    }

    @Override
    public String toString() {
        return (Integer) first + " "  + (Integer) second;
    }
}
public class lop_Pairgenric {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }

}
