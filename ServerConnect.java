
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerConnect {
    public static void main(String[] args) {
        try
        {
           Socket sk = new Socket("time.nist.gov",13);
           InputStream is = sk.getInputStream();
           int data= is.read();
            while(data!= -1){
            System.out.print((char)data);  
            data=is.read();
        }
      }
        catch(UnknownHostException ex)
        {
            System.out.println(ex.getMessage());  
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
