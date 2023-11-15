package QL_phuong_tien_di_chuyen;

public abstract class PhuongTienDiChuyen {
    protected  String tenLoaiPhuongTien;
    protected HangSanXuat HangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.HangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.HangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return this.HangSanXuat.getTenHangSanXuat();
    }
    public void batDau(){
        System.out.println("Bat dau di chuyen");
    }
    public void tangToc(){
        System.out.println("Tang toc");
    }
    public void dungLai(){
        System.out.println("Dung lai");
    }
    public abstract double layVanToc();
}
