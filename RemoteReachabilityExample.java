
package networkprogramming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class RemoteReachabilityExample {
    public static void main(String[] args) {
        String hostname = "www.google.com"; // Replace with your remote system's hostname or IP address
        try {
            InetAddress inetAddress = InetAddress.getByName(hostname);
            boolean isReachable = inetAddress.isReachable(5000); // Timeout in milliseconds
            if (isReachable) {
                System.out.println(hostname + " is reachable");
            } else {
                System.out.println(hostname + " is not reachable");
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + hostname);
        } catch (IOException e) {
            System.out.println("Error checking reachability of " + hostname + ": " + e.getMessage());
        }
    }
    
}
