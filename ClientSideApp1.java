package networkprogramming;

import java.io.DataOutputStream;
import java.net.Socket;


public class ClientSideApp1 
{
    public static void main(String[] args) {
        try{
            Socket s  = new Socket("localhost",7634);
            DataOutputStream dos= new DataOutputStream(s.getOutputStream());
            
            dos.writeUTF("Hello User This is First Socket Program");
            dos.flush();
            dos.close();
            s.close();
        }catch(Exception e)
                {
                    System.out.println("Error in client program"+e);
            
        }
    }
    
}
