package Problem;

import java.io.IOException;
import java.io.*;
import java.util.*;
public class so_khac_nhau_trong_file_2 {
   public static void main(String[] args) throws Exception {
        File file = new File("DATA.IN");
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int[] ans = new int[1005];
        for (int i = 0; i < 100000; i++) {
            ans[dataInputStream.readInt()]++;
        }
        for (int i = 0; i < 1005;i++) {
            if (ans[i] != 0) {
                System.out.println(i + " " + ans[i]);
            }
        }

    }

}
