//package Problem;
//import java.util.*;
//import java.io.*;
//public class tinh_diem_trung_binh {
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("/home/namhai18/NetBeansProjects/JavaApplication1/src/Problem/DATA.in"));
////        Scanner sc = new Scanner(new File("BANGDIEM.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<sv> students = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            students.add(new sv(i+1, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
//        }
//        Collections.sort(students);
//        int cnt = 1;
//        int currentRank = 1;
//        int mark = 1;
//        System.out.print(students.get(0));
//        System.out.println(cnt);
//        for(int i = 1; i < n; i++){
//            System.out.print(students.get(i));
//            if(students.get(i).getTb() == students.get(i-1).getTb()){
//                System.out.println(currentRank);
//                cnt++;
//            }
//            else{
//                System.out.println(currentRank + cnt);
//                currentRank = currentRank + cnt;
//                cnt = 1;
//            }
//
//        }
//    }
//
//}
//
//class sv implements Comparable<sv>{
//    String name;
//    String masv;
//    double toan, ly, hoa, tb;
//
//    public sv(int maSv ,String name, double toan, double ly, double hoa) {
//        String h = String.valueOf(maSv);
//            while(h.length() <= 1){
//                h = "0" + h;
//            }
//            this.masv = "SV" + h;
//        this.name = name;
//        this.toan = toan;
//        this.ly = ly;
//        this.hoa = hoa;
//        this.tb = (toan * 3+ ly * 3+ hoa *2)/8;
//    }
//
//    public double getTb() {
//        return tb;
//    }
//
//    public String xuLyTen(String name){
//        String n = name.trim().toLowerCase();
//        String [] arr = n.split("\\s+");
//        String res = "";
//        for(int i = 0; i < arr.length; i++){
//            res += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
//        }
//        return res;
//    }
//    public String toString(){
//        return this.masv +" " +xuLyTen(this.name)  + String.format("%.2f", this.tb) + " ";
//    }
//
//    @Override
//    public int compareTo(sv sv) {
//        if (sv.getTb() == tb) {
//            return masv.compareTo(sv.masv);
//        } else {
//            return Double.compare(sv.getTb(), tb);
//        }
//    }
//}