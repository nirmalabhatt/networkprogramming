
package networkprogramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class ReseavingBinaryC {
    public static void main(String[] args) 
    {
        try{
            Socket s= new Socket("localhost",1234);
            System.out.println("Connected to server");
            InputStream is= s.getInputStream();
            File output=new File("Nirmala2.JPG");
            FileOutputStream fis= new FileOutputStream(output);
             byte[]buffer= new byte[1024];
                int read;
                while((read=is.read(buffer))!=-1)
                {
                  fis.write(buffer,0,read);
                }
                fis.close();
                is.close();
            
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
