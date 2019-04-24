import java.io.*;
import java.util.*;

/**
 * File IO example
 * @author Mr. Reid
 * @course ICS4UC
 * @date 2018/02/20
 */
public class FileIOExample
{
  public static void main(String args[]) throws Exception
  {
   // Setup files for IO
   Scanner sc = new Scanner(new FileReader("testIn.txt"));
   PrintWriter pw = new PrintWriter(new FileWriter("testOut.txt"));
    
   // Count number of words and output them
   int count = 1;
   while (sc.hasNext())
   {
    String word = sc.next();    
       pw.println(count+" "+word);
       count++;
       pw.flush();
   }
   
   // Close the output file
   pw.close();
   System.out.println("Done");
  }
}