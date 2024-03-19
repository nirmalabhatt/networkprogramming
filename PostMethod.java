
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostMethod {
    public static void main(String[] args) {
        try{
            URL url= new URL("https://gorest.co.in/public/v2/users");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("content-type", "application/json");  
            connection.setRequestProperty("Authorization", "Bearer 2378b077a56ab83e040a4f4b0f3d425a19b9b7380cef29dd26688fc5183f8ce3");
           connection.setRequestMethod("POST");
           connection.setDoOutput(true);

       String reqBody = "{\"id\": \"123mno\",\"name\": \"Nirmala\",\"email\": \"k.jt344354es1t@gmail.com\",\"gender\": \"male\",\"status\": \"inactive\"}";
        OutputStream os = connection.getOutputStream();
        os.write(reqBody.getBytes());
       os.flush();
        os.close();
       connection.setRequestMethod("GET");
       int statusCode = connection.getResponseCode();
       System.out.println(statusCode);
       
        }
        catch(MalformedURLException mfe)
        {
            System.out.println("Exception in the request body ");  
        }
        catch(IOException ex)
        {
            System.out.println("Exception in the Status Code");
        }
            
    }
    
}
