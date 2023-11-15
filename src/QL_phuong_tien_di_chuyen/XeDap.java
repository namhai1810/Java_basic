package QL_phuong_tien_di_chuyen;

public class XeDap extends PhuongTienDiChuyen{
    public XeDap(HangSanXuat HangSanXuat) {
        super("Xe dap", HangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
