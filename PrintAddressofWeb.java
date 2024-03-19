
package networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class PrintAddressofWeb {
    public static void main(String[] args) {
        String domainName = "www.tufohss.edu.np";
        try {
            InetAddress ipAddress = InetAddress.getByName(domainName);
            System.out.println("The IP address of " + domainName + " is " + ipAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve IP address for " + domainName);
        }
    }
    
}
