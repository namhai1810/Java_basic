package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet{
    public Set<String> set = new TreeSet<>();
    public WordSet(String file) throws  FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext()){
            String tmp = sc.next();
            set.add(tmp.toLowerCase());
        }

    }

    @Override
    public String toString() {
        return String.join("\n",set);
    }
}
public class liet_ke_tu_cac_file {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("DATA.in");
        System.out.println(ws);
    }

}
