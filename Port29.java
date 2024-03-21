package networkprogramming;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
public class Port29 
{
    public static void main(String[] args) 
    {
        String host= "localhost";
        if(args.length>0)
        {
            host=args[0];
        }
        System.out.println(host);
        for(int i= 1;i<1024;i++)
           
        {
            try
              {
                Socket sk= new Socket(host,i);
                 
                 
               System.out.println("There is a server in port " +i+ "of"+host);
             }
             catch(UnknownHostException ex)
             {
                System.err.println(ex);
                break;
            }
            catch (IOException e){System.out.println("error");   }
              
        }
    }
}