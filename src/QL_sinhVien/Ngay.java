package QL_sinhVien;

import java.util.Objects;

public class Ngay {
    private int ngay, thang, nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ngay)) return false;
        Ngay ngay1 = (Ngay) o;
        return getNgay() == ngay1.getNgay() && getThang() == ngay1.getThang() && getNam() == ngay1.getNam();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNgay(), getThang(), getNam());
    }
}
