/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

/**
 *
 * @author namhai18
 */
public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;

    public Student(int stt, String ngaySinh,String hoTen, String lop, double gpa) {
        String ma = "";
        if(stt < 10){
            ma = "SV" + "00" + stt;
        }
        else{
            ma = "SV" + "0" + stt;
        }
        this.maSV = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String diem = String.format("%.2f", this.gpa);
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh+ " " + diem;
    }
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
}
