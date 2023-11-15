package QL_film;

public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,25,2023);
        Ngay ngay2 = new Ngay(15,26,2023);

        HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Hãng 2", "Việt Nam");

        BoPhim b1 = new BoPhim("Phim 1", 2023, h1, 100000, ngay1);
        BoPhim b2 = new BoPhim("Phim 2", 2023, h2, 100010, ngay2);

        System.out.println(b1.kiemTraGiaVeReHon(b2));
        System.out.println("Ten hang San Xuat: "+ b1.layTenSanXuat());
        System.out.println("Gia ve giam 10%: " + b1.layMaSauKhuyenMai(10));
        System.out.println("Gia ve giam 20%: " + b1.layMaSauKhuyenMai(20));

    }
}
