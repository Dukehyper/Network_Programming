import java.net.*;

/**
 * Day1
 */
public class Day1 {

    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println(address);
        }
        catch(UnknownHostException ex){
            System.out.println("cound not find ip");
        }
    }
}