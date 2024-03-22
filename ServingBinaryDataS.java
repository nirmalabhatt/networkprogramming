
package networkprogramming;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServingBinaryDataS {
    public static void main(String[] args) {
        // Save Binary data
        try{
            ServerSocket sk= new ServerSocket(1234);
            System.out.println("Server stsrted");
            while(true){
                Socket s= sk.accept();
                File file= new File("Nirmala.JPG");
                FileInputStream fis= new FileInputStream(file);
                OutputStream os= s.getOutputStream();
                byte[]buffer= new byte[1024];
                int read;
                while((read=fis.read(buffer))!=-1){
                  os.write(buffer,0,read);
                }fis.close();
                os.close();
                s.close();}
            }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage()); 
        }
        
    }
    
}
