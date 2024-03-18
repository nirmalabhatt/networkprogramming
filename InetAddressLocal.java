
package networkprogramming;
import java.net.InetAddress;
// to find the IP address,host name,address of local computer
public class InetAddressLocal {
    public static void main(String[] args) {
        try{
        InetAddress add= InetAddress.getLocalHost();
        System.out.println(add);
            System.out.println("IP Address="+add.getHostAddress());
            System.out.println("Host Name="+add.getHostName());
            System.out.println("Address="+add.getAddress());
            System.out.println(add.getCanonicalHostName());
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
}
