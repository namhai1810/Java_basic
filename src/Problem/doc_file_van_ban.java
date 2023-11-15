package Problem;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class doc_file_van_ban {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }

}
