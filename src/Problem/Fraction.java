/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class Fraction {
    private int tu, mau;

    public Fraction(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public void toiGian(){
        int uocChung = gcd(this.tu, this.mau);
        this.tu /= uocChung;
        this.mau /= uocChung;
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction phanSo = new Fraction(sc.nextInt(), sc.nextInt());
        phanSo.toiGian();
        System.out.println(phanSo);
    }
}
