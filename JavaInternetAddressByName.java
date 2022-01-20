import java.net.*;

public class JavaInternetAddressByName {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println(address);
        }
        catch(UnknownHostException ex) {
            System.out.println("Could not find");
        }
    }
}