
package networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipv4And6Address {
    public static void main(String[] args) {
        String domainName = "www.tufohss.edu.np";
        try {
            InetAddress[] addresses = InetAddress.getAllByName(domainName);
            for (int i = 0; i < addresses.length; i++) {
                if (addresses[i].getHostAddress().contains(":")) {
                    System.out.println("IPv6 address: " + addresses[i].getHostAddress());
                } else {
                    System.out.println("IPv4 address: " + addresses[i].getHostAddress());
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve IP address for " + domainName);
        }
    }
    
     
}
    

