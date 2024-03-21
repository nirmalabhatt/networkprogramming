
package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class lab30 {
    public static void main(String[] args) {
      try{
         BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the city name: ");
            String cityName = userInputReader.readLine();  
      }
      catch(IOException ex)
      {
          
      }
            
            
           

    }
    
}
