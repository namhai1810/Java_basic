///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package oop;
//
//import static Problem.Main.chuanHoa;
//import java.util.Scanner;
//
///**
// *
// * @author namhai18
// */
//public class danh_sach_doi_tuong_sinh_vien1 {
//    private class Student{
//        private String id;
//        private String name;
//        private String clas;
//        private String birth;
//        private double gpa;
//
//        public Student(int masv, String name, String clas, String birth, double gpa) {
//            String ma = "";
//            if(masv < 10){
//                ma += "B20DCCN00" + masv;
//            }else{
//                ma += "B20DCCN0" + masv;
//            }
//            this.id = ma;
//            this.name = name;
//            this.clas = clas;
//            this.birth = birth;
//            this.gpa = gpa;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getClas() {
//            return clas;
//        }
//
//        public void setClas(String clas) {
//            this.clas = clas;
//        }
//
//        public String getBirth() {
//            return birth;
//        }
//
//        public void setBirth(String birth) {
//            this.birth = birth;
//        }
//
//        public double getGpa() {
//            return gpa;
//        }
//
//        public void setGpa(double gpa) {
//            this.gpa = gpa;
//        }
//
//
//
//        @Override
//        public String toString() {
//            return this.id + " " + this.name + " " + this.clas + " " + this.birth + " " + this.gpa;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        Student [] arr = new Student[n];
//        for(int i = 0; i < n; i++){
//            String name = sc.nextLine();
//            String clas = sc.nextLine();
//            String birth = sc.nextLine();
//            double gpa = sc.nextDouble();
//            sc.nextLine();
//            arr[i] = new Student(i + 1, name, clas ,  birth, gpa);
//        }
//
//        for(int i = 0; i < n; i++){
//
//        }
//    }
//
//}
