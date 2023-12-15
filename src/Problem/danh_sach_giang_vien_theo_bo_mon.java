
    
package Problem;

import java.util.*;

/**
 *
 * @author namhai18
 */
class gv implements Comparable<gv>{
    String ma, name, subject;

    public gv(int ma, String name, String subject) {
        this.ma = String.format("GV%02d", ma);
        this.name = name;
        String [] k = subject.split("\\s++");
        String res = "";
        for(int i = 0; i < k.length;i++){
            res += k[i].substring(0,1).toUpperCase();
        }
        this.subject = res;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public int compareTo(gv o) {
        String [] a1 = name.split("\\s++");
        String [] a2 = o.name.split("\\s++");
        if(!a1[a1.length -1].equals(a2[a2.length-1])){
            return a1[a1.length -1].compareTo(a2[a2.length-1]);
        }
        return this.ma.compareTo(o.ma);
    }
    
    
    
    
}
public class danh_sach_giang_vien_theo_bo_mon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<gv> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i =0 ;i < t;i++){
            arr.add(new gv(i+1, sc.nextLine(), sc.nextLine()));
        }
        int h = Integer.parseInt(sc.nextLine());
        while(h-->0){
            String res = sc.nextLine();
            
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+ res+":");
            for(int i =0; i <t;i++){
                if(arr.get(i).getName().toLowerCase().contains(res.toLowerCase())){
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN