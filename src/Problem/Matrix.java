///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Problem;
//
//import java.util.Scanner;
//
///**
// *
// * @author namhai18
// */
//public class Matrix {
//    private int n,m;
//    private int [][] mat;
//
//    public Matrix(int n, int m) {
//        this.n = n;
//        this.m = m;
//        this.mat = new int [n][m];
//    }
//    public Matrix(Scanner sc){
//        for(int i =0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//    }
//
//    public Matrix mul(Matrix b){
//        Matrix res = new Matrix(this.n, b.m);
//        for(int i =0 ; i < this.n; i++){
//            for(int j = 0 ; j < b.m; j ++){
//                res.mat[i][j] = 0;
//                for(int k = 0; k < this.m; k++){
//                    res.mat[i][j] += this.mat[i][k] * b.mat[k][j];
//                }
//            }
//        }
//        return res;
//    }
//
//    public Matrix trans(){
//        Matrix res = new Matrix(this.m,this.n);
//        for(int i = 0; i < n; i++){
//            for(int j= 0; j < m; j++){
//                res.mat[j][i] = this.mat[i][j];
//            }
//        }
//        return res;
//    }
//
//    @Override
//    public String toString() {
//        String res = "";
//        for(int i = 0; i < this.n; i++){
//            for(int j = 0; j < this.m; j++){
//                res += this.mat[i][j] + " ";
//            }
//            res += "\n";
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int p = sc.nextInt();
//        Matrix a = new Matrix (n,m);
//        a.nextMatrix(sc);
//        Matrix b = new Matrix(m,p);
//        b.nextMatrix(sc);
//        System.out.println(a.mul(b));
//    }
//}
