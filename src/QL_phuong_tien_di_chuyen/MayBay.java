package QL_phuong_tien_di_chuyen;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu, HangSanXuat HangSanXuat) {
        super("May bay", HangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 500;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public void catCanh(){
        System.out.println("Cat canh");
    }
    public void haCanh(){
        System.out.println("Ha canh");
    }
}
