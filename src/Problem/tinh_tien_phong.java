package Problem;

public class tinh_tien_phong {
    public static void main(String[] args) {

    }
}
class khachHang implements Comparable<khachHang>{
    private String name;
    private String soPhong;
    private String ngayNhanPhong;
    private String ngayTraPhong;
    private String money;

    public khachHang(String name, String soPhong, String ngayNhanPhong, String ngayTraPhong, String money) {
        this.name = name;
        this.soPhong = soPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.money = money;
    }
    @Override
    public int compareTo(khachHang khachHang) {
        return 0;
    }
}
