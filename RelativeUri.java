
package networkprogramming;

import java.net.URI;
import java.net.URISyntaxException;


public class RelativeUri 
{
     public static void main(String[] args) {
        try {
            URI baseURI = new URI("https://www.example.com/folder/");
            URI relativeURI = new URI("input.txt");
            URI resolvedURI = baseURI.resolve(relativeURI);
            System.out.println("Resolved URI: " + resolvedURI.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
