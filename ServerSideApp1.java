
package networkprogramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSideApp1 {

   
    public static void main(String[] args)
    {
        try{
             ServerSocket sk= new ServerSocket(7634);
             System.out.println("Server Socket created");
             Socket s=sk.accept();
             DataInputStream dis= new DataInputStream(s.getInputStream());
             String str=(String)dis.readUTF();
             System.out.println(str);
             sk.close();
            
        }catch(IOException ex)
        {
            System.out.println("problem in Server "+ex);
        }
       
       
    }
    
}
