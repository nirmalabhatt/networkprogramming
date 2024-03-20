
package networkprogramming;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;


public class ReadData {
    public static void main(String[] args)throws Exception {
        //InputStream is= new FileInputStream("input.txt");
        Reader is= new FileReader("input.txt");
        int data= is.read();
        while(data!= -1){
            System.out.print((char)data);  
            data=is.read();
        }
    }
    
}
