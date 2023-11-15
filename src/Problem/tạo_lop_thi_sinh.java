//package Problem;
//
//import java.util.*;
//
//public class tạo_lop_thi_sinh {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
////        SinhVien[] sinhViens = new SinhVien[n];
//        List<SinhVien> s = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            String masv = sc.nextLine();
//            String hoten = sc.nextLine();
//            String dantoc = sc.nextLine();
//            float toan = Float.parseFloat(sc.nextLine());
//            float ly = Float.parseFloat(sc.nextLine());
//            float hoa = Float.parseFloat(sc.nextLine());
//            int diem = Integer.parseInt(sc.nextLine());
//            s.add(new SinhVien(masv, hoten, dantoc, toan, ly, hoa, diem));
//
//        }
//        float check = sc.nextFloat();
//        boolean x = false;
//        for (int i = 0; i < n; i++) {
//            if(s.get(i).getTong() + s.get(i).getPush() >= check && s.get(i).getPush() == 0) {
//                System.out.println(s.get(i).toString() + " TRUNG TUYEN");
//                x = true;
//            }
//        }
//        if (!x) System.out.println("khong co");
//    }
//}
//    class SinhVien{
//        private String masv;
//        private String hoten;
//        private String dantoc;
//        private float toan;
//        private float ly;
//        private float hoa;
//        private float diem;
//        private float tong;
//        private float push = 0;
//
//        public float getPush() {
//            return push;
//        }
//
//        public void setPush(float push) {
//            this.push = push;
//        }
//
//        public String getMasv() {
//            return masv;
//        }
//
//        public void setMasv(String masv) {
//            this.masv = masv;
//        }
//
//        public String getHoten() {
//            return hoten;
//        }
//
//        public void setHoten(String hoten) {
//            this.hoten = hoten;
//        }
//
//        public String getDantoc() {
//            return dantoc;
//        }
//
//        public void setDantoc(String dantoc) {
//            this.dantoc = dantoc;
//        }
//
//        public float getToan() {
//            return toan;
//        }
//
//        public void setToan(float toan) {
//            this.toan = toan;
//        }
//
//        public float getLy() {
//            return ly;
//        }
//
//        public void setLy(float ly) {
//            this.ly = ly;
//        }
//
//        public float getHoa() {
//            return hoa;
//        }
//
//        public void setHoa(float hoa) {
//            this.hoa = hoa;
//        }
//
//        public float getDiemtb() {
//            return diem;
//        }
//
//        public void setDiemtb(float diemtb) {
//            this.diem = diemtb;
//        }
//
//        public float getTong() {
//            return tong;
//        }
//
//        public void setTong(float tong) {
//            this.tong = tong;
//        }
//        public SinhVien(String masv, String hoten, String dantoc, float toan, float ly, float hoa, float diemtb) {
//            this.masv = masv;
//            this.hoten = hoten;
//            this.dantoc = dantoc;
//            this.toan = toan;
//            this.ly = ly;
//            this.hoa = hoa;
//            this.diem = diemtb;
//            this.tong = toan + ly + hoa;
//            this.push = 0;
//        }
//
//        @Override
//        public String toString() {
//
//            if(this.masv.charAt(2) =='1') this.push = 0;
//
//            if(this.masv.charAt(2) =='2') this.push = 1;
//            if(this.masv.charAt(2) =='3') this.push = 2;
//            if(this.diem == 1) this.push += 1.5;
//            if(this.diem == 2) this.push += 1;
//            if(this.diem == 3) this.push += 0.5;
//            if(!this.dantoc.equals("kinh")) this.push += 1;
////            float tong = toan + ly + hoa;
//            float ans = 0;
//            int f = -1;
//            if(this.push - (int)this.push == 0) f = (int)this.push;
//
////            System.out.println(this.push);
//                if(String.valueOf(this.tong).equals(String.valueOf((int)this.tong))){
//                    if(f == -1) {
//                        return (this.masv + " " + this.hoten + " " + this.push + " " + this.tong + " " );
//                    }
//                    else return (this.masv + " " + this.hoten + " " + f + " " + this.tong + " " );
//                }
//                else{
//                    if(f == -1) {
//                        return (this.masv + " " + this.hoten + " " + this.push + " " + String.valueOf((int)this.tong) + " " );
//                    }
//                    else return (this.masv + " " + this.hoten + " " + f + " " + String.valueOf((int)this.tong) + " " );
//
//            }
//                if(String.valueOf(this.tong).equals(String.valueOf((int)this.tong))){
//                    if(f == -1) {
//                        return (this.masv + " " + this.hoten + " " + this.push + " " + String.valueOf((int)this.tong) + " ");
//                    }
//                    else return (this.masv + " " + this.hoten + " " + f + " " + this.tong + " ");
//                }
//                else{
//                    if(f == -1) {
//                        return (this.masv + " " + this.hoten + " " + this.push + " " + String.valueOf((int)this.tong) + " ");
//                    }
//                    else
//                    return (this.masv + " " + this.hoten + " " + f + " " + String.valueOf((int)this.tong) + " ");
//
//                }
//            }
//        }
//    }
//
////2
////KV2A002
////To An An
////kinh
////9
////9
////7
////0
////KV3A004
////Lo Van Lo
////Tay
////9
////9
////7
////3