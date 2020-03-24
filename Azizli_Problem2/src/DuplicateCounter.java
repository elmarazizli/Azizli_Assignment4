import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter
{

    private Map<String, Integer> wordCounter;
    Scanner sc;

    public DuplicateCounter()
    {
        wordCounter = new HashMap<String, Integer>();
    }

    public void count(String dataFile)
    {
        try
        {

            FileInputStream fIS = new FileInputStream(dataFile);
            Scanner sc = new Scanner (fIS) ;
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage()) ;
            return;
        }
        //sc.useDelimiter(" ( [0-9] | [ . , ! ? : ; &#39;\"-] | \ \s) +") ;
        while (sc.hasNext () )
        {
            String input_word = sc.next () . toLowerCase ();
            Integer count_words = wordCounter.get(input_word);
            if(count_words == null)
            {
                count_words = 1;
            }
            else
            {
                count_words = count_words +1;
            }
                 String Stringcount_words = Integer.toString(count_words);
            wordCounter.put(Stringcount_words, count_words);
        }
        sc.close();
    }
    public void write(String outputFile)
    {
        try
        {
            PrintWriter pw = new PrintWriter(new File(outputFile));
            for (String k : wordCounter.keySet () )
            {
                pw.println(k + "" +wordCounter.get(k) );
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage() );
        }
    }
}