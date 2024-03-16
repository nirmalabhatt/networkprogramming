package networkprogramming;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class ClintSocketApp2 {
     public static void main(String[] args) {
        try{
            Socket s  = new Socket("localhost",7634);
            DataOutputStream dos= new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello User This is First Socket Program cllient");
            
             DataInputStream dis= new DataInputStream(s.getInputStream());
             String str=(String)dis.readUTF();
              System.out.println(str);
            dos.flush();
            dos.close();
            s.close();
        }catch(Exception e)
                {
                    System.out.println("Error in client program"+e);
            
        }
    }
   
}
    

