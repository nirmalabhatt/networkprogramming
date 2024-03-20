
package networkprogramming;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadDataBufferReader 
{
     public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();
            while (line != null) 
            {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    
   
     }
}
