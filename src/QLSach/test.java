package QLSach;

public class test {
    public static void main(String[] args) {
        Ngay mot = new Ngay(18,30,2002);
        TacGia hai = new TacGia("Nguyen Van A", mot);
        Sach nhatAnh1 = new Sach("Toi thay hoa vang tren co xanh", 100000, 2019, hai);
        Sach nhatAnh2 = new Sach("Toi thay hoa vang tren co xanh", 100000, 20120, hai);

        nhatAnh1.inTenSach();
        if(nhatAnh1.kiemTraCungNamXuat(nhatAnh2)){
            System.out.println("TRUe");
        }
        else{
            System.out.println("FALSE");
        }
        System.out.println("Sach Giam 10%: " + nhatAnh1.giaSauKhiGiam(10));

    }
}
