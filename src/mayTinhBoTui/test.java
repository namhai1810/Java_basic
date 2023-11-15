package mayTinhBoTui;

public class test {
    public static void main(String[] args) {
        System.out.println("TEST:");
        MayTinhCasioFx500 mt = new MayTinhCasioFx500();
        MayTinhVinacal500 mt1 = new MayTinhVinacal500();
        System.out.println("1 + 2 = " + mt.cong(1, 2));
        System.out.println("1 - 2 = " + mt1.tru(1, 2));
        System.out.println("TEST B:");
        double[] arr = {1, 2, 4, 3, 5};
        SapXepChen sx = new SapXepChen();
        sx.sapXepTang(arr);
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sx.sapXepGiam(arr);
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        SapXepChon sx1 = new SapXepChon();
        sx1.sapXepTang(arr);
        for(double i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        sx1.sapXepGiam(arr);
        for(double i: arr){
            System.out.print(i + " ");
        }
        System.out.println("TEST C");
        PhanMemMayTinh pt = new PhanMemMayTinh();
        System.out.println("1 + 2 = " + pt.cong(1, 2));
        System.out.println("1 - 2 = " + pt.tru(1, 2));
        pt.sapXepTang(arr);
        for(double i: arr){
            System.out.print(i + " ");
        }
        pt.sapXepGiam(arr);
        for(double i: arr){
            System.out.print(i + " ");
        }
    }
}
