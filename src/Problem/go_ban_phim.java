//package Problem;
//
//import java.util.Scanner;
//
//public class go_ban_phim {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String ans = "";
//        StringBuilder sb = new StringBuilder(ans);
//        int  k =0;
//        for(int i = 0; i < s.length() ;i++){
//            if(s.charAt(i) == '<'){
//                if(k>0)
//                    k--;
//                continue;
//            }
//            else if(s.charAt(i) == '>') {
//                if(k<=sb.length()){
//                    k++;
//                }
//            }
//            else if(s.charAt(i) == '-') {
//                if (k <= sb.length())
//                    sb.deleteCharAt(k);
//            }
//            else {
//                sb.insert(k, s.charAt(i));
//                k++;
//            }
//            System.out.println(sb + " " + k);
////            System.out.println(sb.length());
//        }
//        System.out.println(sb.reverse());
//
//    }
//}