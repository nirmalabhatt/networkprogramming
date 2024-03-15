
package networkprogramming;

import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) {
        try{
            URL url= new URL("ftp://www.tufohss.edu.np");
        System.out.println("Protocol:"+url.getProtocol());
            System.out.println("Host:"+url.getHost());
            System.out.println("port:"+url.getPort());
            System.out.println("Path:"+url.getPath());
            System.out.println("Query"+url.getQuery());
            System.out.println("Fragment"+url.getRef());
        }catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
        
    }
    
}
