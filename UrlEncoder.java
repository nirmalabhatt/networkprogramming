
package networkprogramming;

import java.net.URLEncoder;


public class UrlEncoder {
    public static void main(String[] args)
    { 
        try
        {
            String query= "q={Network programming}with:java pro%gramming/language";
        String encodedQuery= URLEncoder.encode(query,"utf-8" );
        System.out.println("The Encoded Query is :"+encodedQuery);
        }
        catch(Exception e)
        {
            System.out.println("Problem in the encoded method"+e);
        }
        
        
    }
    
}
