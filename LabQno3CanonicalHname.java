
package networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class LabQno3CanonicalHname {
     public static void main(String[] args) {
        String ipAddress = "192.168.0.1";
        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            String canonicalHostname = address.getCanonicalHostName();
            System.out.println("The canonical hostname of " + ipAddress + " is " + canonicalHostname);
        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve hostname for " + ipAddress);
        }
    }
    
}
