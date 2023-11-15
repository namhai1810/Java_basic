package QL_sinhVien;

public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(1, 1, 2000);
        Ngay ngay2 = new Ngay(1, 2, 2000);

        Lop lop1 = new Lop("CTK43", "CNTT");
        Lop lop2 = new Lop("CTK44", "CNTT");

        SinhVien sv1 = new SinhVien("001", "Nguyen Van A", ngay1, 9.0, lop1);
        SinhVien sv2 = new SinhVien("002", "Nguyen Van B", ngay2, 8.0, lop2);
        System.out.println(sv1.layTenKhoa());
        System.out.println(sv1.kiemTraThiDat());
        System.out.println(sv2.kiemTraThiDat());
        System.out.println(sv1.kiemTraNgaySinh(sv2));


    }
}
