
package networkprogramming;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class DownloadWebpage {
    public static void main(String[] args) {
        try{
            
        
         URL url = new URL("https://www.example.com");
           InputStream inputStream = url.openStream();
            System.out.println((char)inputStream.read());
           /*BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
*/
           int data = inputStream.read();
           while(data != -1){
               System.out.print((char)data);
               data= inputStream.read();
           }
            inputStream.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception in the  URL");
        }
    }
    
}
