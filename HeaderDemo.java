
package networkprogramming;

import java.net.HttpURLConnection;
import java.net.URL;


public class HeaderDemo {
    public static void main(String[] args) {
        try{
            URL url= new URL("https://www.tufohss.edu.np");
           HttpURLConnection conn= (HttpURLConnection)url.openConnection();
            System.out.println("Content type:"+conn.getContentType());
            System.out.println("Content Length:"+conn.getContentLength());
            System.out.println("Content Encoding:"+conn.getContentEncoding());
            System.out.println("Date:"+conn.getDate());
            System.out.println("Last Modified Date:"+conn.getLastModified());
            System.out.println("Expares Date: "+ conn.getExpiration());
            String content= conn.getHeaderField("Content-Type");
            System.out.println("Content Type:"+content);
           
        }catch(Exception ex)
                {
                    System.out.println("Exception in URL");
        }
    }
    
}
