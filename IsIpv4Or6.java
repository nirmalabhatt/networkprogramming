
package networkprogramming;

import java.net.InetAddress;
public class IsIpv4Or6 {
     public static void main(String[] args) throws Exception {
      //System.out.println(getVersion());     
       String ipAddress = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
       InetAddress a = InetAddress.getByName(ipAddress);
       System.out.println(getVersion(a));
}
      public static int getVersion(InetAddress ia)
              {
               byte[] ipAddress=ia.getAddress();
                  System.out.println(ipAddress.length);
               if(ipAddress.length==4){
                   return 4;
               }else if(ipAddress.length==16){
                return 6;   
               }
               else return -1;   
        }  
      
}

