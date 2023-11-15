package Problem;

import java.util.Scanner;

public class khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        double math = sc.nextDouble();
        double literature = sc.nextDouble();
        double english = sc.nextDouble();
        double sum = math + literature + english;
        System.out.println(name + " " + date + " " + String.format("%.1f", sum));

    }
}
