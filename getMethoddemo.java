/*Write a Java Program to Get the JSON Data From the Following URL Using GET
Method. Also Print http status code in console
https://gorest.co.in/public/v2/users*/

package networkprogramming;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class getMethoddemo {
    public static void main(String[] args) {
        try{
        URL url= new URL("https://gorest.co.in/public/v2/users");
        HttpURLConnection conn= (HttpURLConnection)url.openConnection();
        conn.setRequestProperty("content-type","application/json");
        InputStream input=conn.getInputStream();
        int data= input.read();
        while(data!=-1)
        {
            System.out.print((char)data);
            data= input.read();
        }
        
        
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}
