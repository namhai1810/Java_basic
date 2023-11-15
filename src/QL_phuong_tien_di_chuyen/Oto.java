package QL_phuong_tien_di_chuyen;

public class Oto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public Oto(String loaiNhienLieu, HangSanXuat HangSanXuat) {
        super("Oto", HangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
