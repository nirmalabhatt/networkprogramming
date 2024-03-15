
package networkprogramming;

import java.io.InputStream;
import java.net.URL;
   
public class UrlReader {
     
     public static void main(String[] args) {
         try{
              URL url= new URL("https://www.example.com");
              InputStream ins= url.openStream();
              int data= ins.read();
              while(data!=-1)
                      {
                          System.out.println((char)data);
                          data= ins.read();
                      }
              ins.close();
              
         }catch(Exception e)
         {
             System.out.println("Exception"+e);
         }
       
    }
    
}
