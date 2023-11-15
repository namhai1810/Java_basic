package overloading;

public class MyMath {
    public int timMin(int a, int b) {
        return (a < b) ? a : b;
    }
    public double timMin(double a, double b) {
        return (a < b) ? a : b;
    }
    public int tinhTong(int a, int b){
        return a + b;
    }
    public double tinhTong(double[] a){
        double tong = 0;
        for (double i : a) {
            tong += i;
        }
        return tong;
    }
}
