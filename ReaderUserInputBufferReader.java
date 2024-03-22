
package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReaderUserInputBufferReader 
{
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            reader.close(); 
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
