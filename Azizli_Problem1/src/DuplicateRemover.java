import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

    private Set<String> uniqueWords;

    public DuplicateRemover() {
        uniqueWords = new HashSet<>();
    }

    public void remove(String dataFile) {
        try {
            FileInputStream fIS = new FileInputStream(dataFile);
            Scanner scan = new Scanner(fIS);
            while (scan.hasNext()) {
                uniqueWords.add(scan.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public void write(String outputFile) {
        try {
            PrintWriter pt = new PrintWriter(new File(outputFile));
            for (String string : uniqueWords) {
                pt.print(string + " ");
            }
            pt.flush();
            pt.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}