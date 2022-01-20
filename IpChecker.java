// IP of any host name
import java.net.*;
import java.io.*;
import java.net.InetAddress;
 
public class IpChecker
{
    public static void main(String args[]) throws Exception
    {
        // Returns the instance of InetAddress containing
        // local host name and address
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("System IP Address : " +
                      (localhost.getHostAddress()).trim());
 
        // Find public IP address
        String systemipaddress = "";
        try
        {
            URL url_name = new URL("https://www.tiktok.com/");
 
            BufferedReader sc =
            new BufferedReader(new InputStreamReader(url_name.openStream()));
 
            // reads system IPAddress
            systemipaddress = sc.readLine().trim();
        }
        catch (Exception e)
        {
            System.out.println(e);
            systemipaddress = "Cannot Execute Properly";
        }
        System.out.println("Public IP Address: " + systemipaddress +"\n");
    }
}