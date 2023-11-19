package Problem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
import java.io.*;
public class Liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>) sc1.readObject();
        ArrayList<String> b = new ArrayList<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for (String i : a)
            set1.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        while (sc2.hasNextLine())
        {
            String s = sc2.nextLine().trim().toLowerCase();
            b.addAll(Arrays.asList(s.split("\\s+")));
        }
        for (String i : b)
        {
            if (!set2.contains(i) && set1.contains(i))
            {
                System.out.println(i);
                set2.add(i);
            }
        }
    }
}
