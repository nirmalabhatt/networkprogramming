
package networkprogramming;

import java.net.InetAddress;


public class GetByNameMethod {
    public static void main(String[] args) {
        try{
        
             //InetAddress [] add= InetAddress.getAllByName("www.facebook.com");
            InetAddress [] add= InetAddress.getAllByName("www.youtube.com");
             for(InetAddress inet:add)
             {
                 System.out.println("Addresses="+inet);
             }
             
           
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
}
