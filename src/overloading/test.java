package overloading;

public class test {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.timMin(1, 2));
        System.out.println(myMath.timMin(1.0, 2.0));
        System.out.println(myMath.tinhTong(1, 2));
        System.out.println(myMath.tinhTong(new double[]{1.0, 2.0}));
    }
}
