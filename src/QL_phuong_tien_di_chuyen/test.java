package QL_phuong_tien_di_chuyen;

public class test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Honda", "Nhat Ban");
        HangSanXuat h2 = new HangSanXuat("Toyota", "Nhat Ban");
        HangSanXuat h3 = new HangSanXuat("Boeing", "My");
        PhuongTienDiChuyen p1 = new XeDap(h1);
        PhuongTienDiChuyen p2 = new Oto("Xang",h2);
        PhuongTienDiChuyen p3 = new MayBay("Dau may",h3);
        System.out.println("hang san Xuat: "+ p1.layTenHangSanXuat());
        System.out.println("Van toc oto: "+ p2.layVanToc());
        MayBay p4 = new MayBay("Dau may",h3);
        p4.catCanh();
    }
}
