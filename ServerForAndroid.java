package networkprogramming;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerForAndroid {
     public static void main(String[] args)
    {
        try
        {
             ServerSocket sk= new ServerSocket(7634);
             System.out.println("Server Socket created");
             Socket s=sk.accept();
             DataInputStream dis= new DataInputStream(s.getInputStream());
             String str=(String)dis.readUTF();
             System.out.println(str);
             DataOutputStream dos= new DataOutputStream(s.getOutputStream());
             dos.writeUTF("Hello User This is First Socket Program Server");
             sk.close();   
        }
        catch(IOException ex)
        {
            System.out.println("problem in Server "+ex);
        }   
    }   
}
